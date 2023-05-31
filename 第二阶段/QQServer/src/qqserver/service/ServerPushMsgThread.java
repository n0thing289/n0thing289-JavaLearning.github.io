package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerPushMsgThread extends Thread{
    private static final Scanner scan = new Scanner(System.in);
    @Override
    public void run() {

        while(true){
            System.out.print("是否推送消息？(y/n):");
            String choose = scan.next();
            if("y".equals(choose)){
                System.out.print("请输入你要推送的消息");
                String pushContent = scan.next();
                Message pushMsg = new Message();
                pushMsg.setSender("Server");
                pushMsg.setContent(pushContent);
                pushMsg.setMesType(MessageType.MESSAGE_SERVER_PUSH);

                String onlineUsers = ManageServerConnectClientThreads.getOnlineUsers();
                String[] split = onlineUsers.split(" ");
                for (int i = 0; i<split.length;i++){
                    ServerConnectClientThread serverConnectClientThread = ManageServerConnectClientThreads.getServerConnectClientThread(split[i]);
                    Socket socket = serverConnectClientThread.getSocket();

                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        objectOutputStream.writeObject(pushMsg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
