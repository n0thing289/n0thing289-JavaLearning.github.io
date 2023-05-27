package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * 这是服务器，在监听8080端口，等待服务器连接，并保持通信
 */
public class QQServer {
    private ServerSocket serverSocket = null;

    //创建一个集合,存放多个用户,如果这些用户登录就认为是合法的
    private static HashMap<String, User> validUsers = new HashMap<>();

    static{
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
    }

    private boolean checkUser(String userId,String password){
        User user = validUsers.get(userId);
        if(user == null){
            return false;
        }
        if (!(user.getPassword().equals(password))){
            return false;
        }
        return true;
    }

    public QQServer() throws IOException {

        try {
            System.out.println("服务器在8080端口监听...");
            serverSocket = new ServerSocket(8080);//以后端口可以写在一个配置文件
            while (true) {
                //不断地监听有一个客户端请求连接,就专门在生成一个套接字为对应地客户端服务
                Socket socket = serverSocket.accept();
                //得到socket关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User user = (User) ois.readObject();

                //创建一个Message对象
                Message message = new Message();
                //这里去做写死了的验证
                if (checkUser(user.getUserId(), user.getPassword())) {
                    System.out.printf("%s 验证成功\n", user);
                    //登录成功,那么要返回客户端Message对象
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复给客户端
                    oos.writeObject(message);
                    oos.flush();
//                    socket.shutdownOutput();
                    //那么就创建一个线程和客户端保持通信
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, user.getUserId());
                    serverConnectClientThread.start();
                    //把线程对象放入集合中管理
                    ManageServerConnectClientThreads.addServerConnectClientThread(user.getUserId(), serverConnectClientThread);
                } else {//登录失败
                    System.out.printf("%s 验证失败\n", user);
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    oos.flush();
//                    socket.shutdownOutput();
                    socket.close();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //如果服务的退出了while,说明服务器不在监听,因此关闭ServerSocket
            try {
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
