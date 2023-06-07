package qqclient.service;

import java.io.*;
import java.net.Socket;

public class ReceiveFileThread implements Runnable{
    private Socket socket = null;
    private String filename = null;

    public ReceiveFileThread(Socket socket, String content) {
        this.socket = socket;
        String[] split = content.split("\\\\");
        String s = split[split.length - 1];
        this.filename = s;
    }

    @Override
    public void run() {
        String parentPath = "src\\qqclient\\service\\data\\sharefiles\\";
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println("等待接受文件ing");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
            System.out.println("开始接受文件ing");

            fileOutputStream = new FileOutputStream(parentPath + filename);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            int readLen;
            byte[] buf = new byte[1024];

            while((readLen = bufferedInputStream.read(buf)) != -1){
                bufferedOutputStream.write(buf, 0, readLen);
            }
            System.out.println("接收端接受完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
