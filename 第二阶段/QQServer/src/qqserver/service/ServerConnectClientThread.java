package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 * 该类对应对象与某个对应的客户端保持通信
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {
        //让这个套接字一直监听某个客户端
        while (true) {
            try {
                System.out.println("服务端和客户端保持通信, 读取数据");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message msg = (Message) ois.readObject();


                if (msg.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    System.out.println(msg.getSender() + "正在请求拉取在线用户列表");
                    //如果判断出客户端的请求在线用户列表的消息类型
                    //拿到所有的在线用户
                    String users = ManageServerConnectClientThreads.getOnlineUsers();
                    //将在线用户和消息类型封装到一个message对象
                    Message retMsg = new Message();
                    retMsg.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    retMsg.setContent(users);
                    retMsg.setGetter(msg.getSender());
                    //发送message
                    ServerConnectClientThread scct = ManageServerConnectClientThreads.getServerConnectClientThread(userId);
                    Socket scctSocket = scct.getSocket();
                    ObjectOutputStream oos = new ObjectOutputStream(scctSocket.getOutputStream());
                    oos.writeObject(retMsg);
                } else if (msg.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    System.out.println(msg.getSender() + "请求下线");
                    ServerConnectClientThread scct = ManageServerConnectClientThreads.getServerConnectClientThread(msg.getSender());

                    scct.getSocket().close();
                    System.out.println(msg.getSender() + "下线成功");
                    break;
                } else {
                    System.out.println("其他类型的message, 暂时不处理");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    public Socket getSocket() {
        return socket;
    }
}
