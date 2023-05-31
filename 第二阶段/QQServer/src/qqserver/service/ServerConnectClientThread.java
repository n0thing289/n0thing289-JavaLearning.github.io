package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
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
                System.out.println("服务端和" + userId + "客户端保持通信, 读取数据");
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
                    //拿到对应的线程及其套接字
                    ServerConnectClientThread scct = ManageServerConnectClientThreads.getServerConnectClientThread(msg.getSender());
                    //关闭对应的套接字
                    scct.getSocket().close();
                    //在线程集合中清除对应的用户线程
                    ManageServerConnectClientThreads.removeServerConnectClientThread(msg.getSender());
                    System.out.println(msg.getSender() + "下线成功");
                    break;
                } else if (msg.getMesType().equals(MessageType.MESSAGE_GET_PRIVATE_CHAT)) {
                    String src = msg.getSender();
                    String dest = msg.getGetter();
                    String content = msg.getContent();
                    //转发数据包
                    Message srcToDestMsg = new Message();
                    srcToDestMsg.setSender(src);
                    srcToDestMsg.setGetter(dest);
                    srcToDestMsg.setContent(content);
                    srcToDestMsg.setMesType(MessageType.MESSAGE_RET_PRIVATE_CHAT);

                    //简单判断一下目标用户必须在线才行
                    ServerConnectClientThread scct_Dest = ManageServerConnectClientThreads.getServerConnectClientThread(dest);
                    if (scct_Dest != null) {
                        Socket scctSocket = scct_Dest.getSocket();
                        ObjectOutputStream oos_Dest = new ObjectOutputStream(scctSocket.getOutputStream());
                        oos_Dest.writeObject(srcToDestMsg);
                    } else {
                        //如果目标不在线,服务器提醒发送者目标不在
                        srcToDestMsg.setSender("服务器");
                        srcToDestMsg.setGetter(src);
                        srcToDestMsg.setContent("目标不在线");

                        ServerConnectClientThread scct_Src = ManageServerConnectClientThreads.getServerConnectClientThread(src);
                        Socket scct_srcSocket = scct_Src.getSocket();
                        ObjectOutputStream oos_src = new ObjectOutputStream(scct_srcSocket.getOutputStream());
                        oos_src.writeObject(srcToDestMsg);
                        //这里日后在设置一个消息类型-让发送者自动退出私聊
                    }

                } else if (msg.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    String onlineUsers = ManageServerConnectClientThreads.getOnlineUsers();//return "用户A 用户B 用户C"
                    String[] onlineUsersArr = onlineUsers.split(" ");
                    String src = msg.getSender();
                    String content = msg.getContent();

                    Message pubChatMsg = new Message();
                    pubChatMsg.setSender(src);
                    pubChatMsg.setContent(content);
                    pubChatMsg.setMesType(MessageType.MESSAGE_COMM_MES);

                    for (int i = 0; i < onlineUsersArr.length; i++) {
                        String currentDestUserId = onlineUsersArr[i];
                        if (currentDestUserId.equals(src)) {
                            continue;
                        }
                        ServerConnectClientThread scct = ManageServerConnectClientThreads.getServerConnectClientThread(currentDestUserId);
                        Socket scctSocket = scct.getSocket();

                        try {
                            new ObjectOutputStream(scctSocket.getOutputStream()).writeObject(pubChatMsg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }else if (msg.getMesType().equals(MessageType.MESSAGE_SEND_FILE)){
                    System.out.println("MESSAGE_SEND_FILE");
                }
                else {
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
