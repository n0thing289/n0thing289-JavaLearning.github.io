package qqclient.service;

import qqcommon.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread{
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //一直在后台读数据,或者写数据,因此做成无限循环
        while(true){

            System.out.println("客户端线程,等待读取数据");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message msg = (Message) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //为了更方便拿到套接字,提供套接字
    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
