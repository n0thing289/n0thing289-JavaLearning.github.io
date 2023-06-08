package qqclient.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        //1. 读取文件
        try {
            System.out.println(filepath);
            FileInputStream fileInputStream = new FileInputStream(filepath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            int readLen;
            byte[] buf = new byte[1024];
            while((readLen = bufferedInputStream.read(buf)) != -1){
                //2. 向服务器发送文件
                bufferedOutputStream.write(buf, 0,readLen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
