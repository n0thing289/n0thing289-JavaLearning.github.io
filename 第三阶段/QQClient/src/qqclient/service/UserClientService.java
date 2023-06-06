package qqclient.service;

import qqclient.view.UI;
import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

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
//        socket.shutdownOutput();

        //2.2.3 接收服务器返回的Message对象
        ObjectInputStream ois_socket = new ObjectInputStream(socket.getInputStream());
        Message msg = (Message) ois_socket.readObject();
        System.out.println(msg);
        if (MessageType.MESSAGE_LOGIN_SUCCEED.equals(msg.getMesType())) {
            System.out.println("登录成功");

            /*在这里要创建一个线程,是其保持与服务器的连接*/
            ClientConnectServerThread ccstThread = new ClientConnectServerThread(socket);
            ccstThread.start();

            //为了后面客户端的扩展/线程管理, 把线程放入到集合中管理
            ManageClientConnectServerThreads.addClientConnectServerThread(id, ccstThread);
            b = true;
        } else {
            //如果登录失败, 就不能启动和服务器通信的线程,关闭socket
            socket.close();
        }
        //2.2.3 （暂时关闭）关闭套接字和流
//        oos_socket.close();
//        ois_socket.close();
        //3. 接收服务器传回来的数据
        return b;
    }

    //向服务器请求在线用户列表
    public void getOnlineFriendList() {
        UI.setLoopV2(false);
        //发送
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(user.getUserId());
        //发送给服务器
        //得到当前线程socket对应的ObjectOutputStream对象
        try {
            //根据id拿到对应线程
            ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(user.getUserId());
            //根据对应的线程拿到套接字
            Socket ccstSocket = ccst.getSocket();
            ObjectOutputStream oos = new ObjectOutputStream(ccstSocket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitQQ(String userId) {
        //拿到对应的线程，及其对应的套接字
        ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(userId);
        Socket ccstSocket = ccst.getSocket();
        try {
            //发送客户端退出的消息
            Message exitMsg = new Message();
            exitMsg.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
            exitMsg.setSender(userId);
            ObjectOutputStream oos = new ObjectOutputStream(ccstSocket.getOutputStream());
            oos.writeObject(exitMsg);
            System.out.println(userId + "退出系统");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        ccst.setLive(false);
        System.exit(0);
    }

    //这里写一个私聊的方法
    public void privateChat() {
        Scanner scanner = new Scanner(System.in);
        //私聊谁->拿到那个用户的套接字

        //提示用户,拿到目标用户名
        System.out.println("正在开启私聊连接");
        System.out.print("你要和谁私聊(-1退出私聊): ");
        String destUserId = scanner.next();
        System.out.println("==========正在与" + destUserId + "聊天==========");

        while (true) {
            System.out.printf("%s <<< %s: ", destUserId, user.getUserId());
            String contains = scanner.next();
            if ("-1".equals(contains)) {
                break;
            }
            System.out.print("\n");

            Message chatMsg = new Message();
            chatMsg.setMesType(MessageType.MESSAGE_GET_PRIVATE_CHAT);
            chatMsg.setSender(user.getUserId());
            chatMsg.setGetter(destUserId);
            chatMsg.setContent(contains);

            try {
                //发送数据包给服务器
                //拿到当前用户的套接字进行发送数据
                ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(user.getUserId());
                Socket ccstSocket = ccst.getSocket();
                ObjectOutputStream oos = new ObjectOutputStream(ccstSocket.getOutputStream());
                oos.writeObject(chatMsg);
                //这里就先一直进行监听私聊信息
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

    public void publicChat() {
        /*群发消息（对所有在线用户发信息）先实现全部人都发
          1. 发送群聊数据包

        * */
        System.out.println("==========正在对大家聊天==========");
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.print("<<<: ");
            String publicContent = scan.next();
            if ("-1".equals(publicContent)) {
                break;
            }
            Message pubChatMsg = new Message();
            pubChatMsg.setMesType(MessageType.MESSAGE_COMM_MES);
            pubChatMsg.setSender(user.getUserId());
            pubChatMsg.setContent(publicContent);

            try {
                ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(user.getUserId());
                Socket ccstSocket = ccst.getSocket();
                ObjectOutputStream oos = new ObjectOutputStream(ccstSocket.getOutputStream());
                oos.writeObject(pubChatMsg);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void sendFile() {
        Scanner scan = new Scanner(System.in);
        //拿到文件路径
        System.out.print("请输入您想发送文件的绝对地址:");
        String filepath = scan.next();

        System.out.print("你要发给谁:");
        String destUserId = scan.next();

        File file = new File(filepath);
        if (true) {

            try {
                //用新套接字连接服务器，并发送 文件消息
                Message preparationMsg = new Message();
                preparationMsg.setSender(user.getUserId());
                preparationMsg.setGetter(destUserId);
                preparationMsg.setContent(filepath);
                preparationMsg.setMesType(MessageType.MESSAGE_SEND_FILE);
                //old
//                Socket filesocket = new Socket(InetAddress.getLocalHost(), 8080);
//                new ObjectOutputStream(filesocket.getOutputStream()).writeObject(preparationMsg);
//                new MyObjectOutputStream(filesocket.getOutputStream()).writeObject(preparationMsg);
                //先用原本的线程发消息告知服务器
                ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(user.getUserId());
                Socket socket = ccst.getSocket();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(preparationMsg);
                //old
//                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
//                Message readyMsg = (Message) (new ObjectInputStream(socket.getInputStream())).readObject();
//                if(readyMsg.getMesType().equals(MessageType.MESSAGE_READY_TRANSFER_FILE)){
//                    //开线程给服务器发送数据
//                    ClientCopeWithFileThread sendFileThread = new ClientCopeWithFileThread(socket, "sendFileMode", filepath, user.getUserId(), destUserId);
//                    new Thread(sendFileThread).start();
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("文件不存在,请重试");
        }

    }

}

class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //重写读取头部信息方法：不写入头部信息
        super.reset();
    }
}

class MyObjectInputStream extends ObjectInputStream {
    public MyObjectInputStream(InputStream in) throws IOException {
        super(in);
    }

    @Override
    protected void readStreamHeader() throws IOException {
        //重写读取头部信息方法：什么也不做
    }
}

