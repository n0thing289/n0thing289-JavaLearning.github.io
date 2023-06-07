package qqclient.service;

import java.net.Socket;

public class SendFileThread implements Runnable{
    private Socket socket = null;
    private String filepath = null;

    public SendFileThread(Socket socket, String content) {
        this.socket = socket;
        this.filepath = content;
    }

    @Override
    public void run() {

    }
}
