package qqclient.service;

import qqclient.view.UI;
import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientConnectServerThread extends Thread {
    private Socket socket;
    private boolean isLive = true;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //一直在后台读数据,或者写数据,因此做成无限循环
        while (isLive) {
//            System.out.println("客户端线程, 等待读取数据");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message msg = (Message) ois.readObject();


                //判断这个message类型
                if (msg.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {

                    //如果读到的是服务端返回的在线用户列表
                    //取出在线列表信息,并显示
                    //规定好列表形式
                    String[] online_users = msg.getContent().split(" ");
                    System.out.println("===========当前在线用户列表==========");
                    for (int i = 0; i < online_users.length; i++) {
                        System.out.println("用户: " + online_users[i]);
                    }
                    UI.setLoopV2(true);
                } else if (msg.getMesType().equals(MessageType.MESSAGE_RET_PRIVATE_CHAT)) {
                    //接收那个用户发送的数据包
                    System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t[私聊消息]%s >>> %s: %s\n>", msg.getSender(), msg.getGetter(), msg.getContent());
                } else if (msg.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t[群发消息]%s 对 %s: %s\n>", msg.getSender(), "大家说", msg.getContent());
                }else if(msg.getMesType().equals(MessageType.MESSAGE_READY_TRANSFER_FILE)){
                    String src = msg.getSender();
                    String dest = msg.getGetter();
                    String content = msg.getContent();

                    Socket filesocket = new Socket(InetAddress.getLocalHost(), 8888);
                    System.out.println("发送端连接中");

                    new Thread(new SendFileThread(filesocket, content)).start();
                }
                else if (msg.getMesType().equals(MessageType.MESSAGE_RECEIVE_FILE)) {
                    String src = msg.getSender();
                    String dest = msg.getGetter();
                    String content = msg.getContent();
                    //回复客户端准备就绪
                    Message resStatueToServerMsg = new Message();
                    resStatueToServerMsg.setSender(src);
                    resStatueToServerMsg.setGetter(dest);
                    resStatueToServerMsg.setContent(content);
                    resStatueToServerMsg.setMesType(MessageType.MESSAGE_READY_TRANSFER_FILE);

                    Socket filesocket = new Socket(InetAddress.getLocalHost(), 8888);
                    System.out.println("接收端开启专属文件通道中。。。");

                    Socket resSocket = ManageClientConnectServerThreads.getClientConnectServerThread(dest).getSocket();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(resSocket.getOutputStream());
                    objectOutputStream.writeObject(resStatueToServerMsg);
                    //创建接收文件的套接字， 并且开器线程
                    new Thread(new ReceiveFileThread(filesocket, content)).start();
                } else if (msg.getMesType().equals(MessageType.MESSAGE_SERVER_PUSH)) {
                    System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t[群发消息]%s 对 %s: %s\n>", msg.getSender(), "大家说", msg.getContent());
                } else {
                    //
                    System.out.println("msg是其他类型的message, 暂时不处理");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        try {
//            socket.shutdownInput();
//            socket.shutdownOutput();
//            socket.close();
//            System.out.println("读取数据的线程退出。。。");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    //为了更方便拿到套接字,提供套接字
    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

}
