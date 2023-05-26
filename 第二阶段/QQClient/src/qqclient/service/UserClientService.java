package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 该类完成用户登录验证和用户注册等功能
 */
public class UserClientService {
    private User user = new User();//因为在其他地方可能也要用user，所以做成属性
    private Socket socket;//因为在其他地方可能也要用socket，所以做成属性

    public boolean checkUser(String id, String password) throws IOException, ClassNotFoundException {
//        User user;
        boolean b = false;
        //1. 接收参数, 创建号User对象
        user.setUserId(id);
        user.setPassword(password);
        //2. 向服务器发User数据(dat)
        //2.1 将user序列化成dat文件
        String path = "src\\qqclient\\service\\data\\loginServerData\\";
        String filePath = path + id + ".dat";
        File file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("初始化新用户");
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        oos.writeObject(user);
        oos.close();//写完就关闭
        //2.2 发送dat文件
        //2.2.1 创建套接字, ,关闭套接字
        socket = new Socket(InetAddress.getLocalHost(), 8080);// 因为测试时服务器一般是自己主机, ip就写了本机ip
        //2.2.2 然后发送
        ObjectOutputStream oos_socket = new ObjectOutputStream(socket.getOutputStream());
        oos_socket.writeObject(user);
        oos_socket.flush();
        socket.shutdownOutput();

        //2.2.3 接收服务器返回的Message对象
        ObjectInputStream ois_socket = new ObjectInputStream(socket.getInputStream());
        Message msg = (Message) ois_socket.readObject();
        if (MessageType.MESSAGE_LOGIN_SUCCEED.equals(msg.getMesType())) {
            System.out.println("登录成功");

            /*在这里要创建一个线程,是其保持与服务器的连接*/
            ClientConnectServerThread ccstThread = new ClientConnectServerThread(socket);
            ccstThread.start();

            //为了后面客户端的扩展/线程管理, 把线程放入到集合中管理
            ManageClientConnectServerThread.addClientConnectServerThread(id, ccstThread);
            b = true;
        } else {
            //如果登录失败, 就不能启动和服务器通信的线程,关闭socket
            socket.close();
        }
        //2.2.3 （暂时关闭）关闭套接字和流
        oos_socket.close();
        ois_socket.close();
        //3. 接收服务器传回来的数据
        return b;
    }

}
