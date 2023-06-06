package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientCopeWithFileThread extends ClientConnectServerThread implements Runnable {
    private String funcName = null;
    private String filepath = null;
    private String userId = null;
    private String destUserId = null;
    private Socket fileSocket = null;

    public ClientCopeWithFileThread(Socket fileSocket) {
        super(fileSocket);
        this.fileSocket = fileSocket;
    }

    public ClientCopeWithFileThread(Socket fileSocket, String funcName, String filepath, String userId, String destUserId) {
        super(fileSocket);
        this.fileSocket = fileSocket;
        this.funcName = funcName;
        this.filepath = filepath;
        this.userId = userId;
        this.destUserId = destUserId;
    }

    @Override
    public void run() {
        synchronized (this){
            if ("sendFileMode".equals(funcName)) {
                sendFile();
            } else if ("receiveFileMode".equals(funcName)) {
                receiveFile();
            } else {
                System.out.println("模式写错了");
            }
        }
    }

    public void sendFile() {
        try {
            System.out.println("发送端开始发送...");
            Socket ccstSocket = fileSocket;

            FileInputStream fileInputStream = new FileInputStream(filepath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(ccstSocket.getOutputStream());
            int readLen;
            byte[] buf = new byte[1024];
            while ((readLen = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf, 0, readLen);
            }
            bufferedOutputStream.flush();
            fileSocket.shutdownOutput();
            System.out.println("发送端发送完成,待机中...");
            bufferedOutputStream.close();
            bufferedInputStream.close();
            fileSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receiveFile() {
        //注意要拿到接收端的套接字
        try {
            System.out.println("接收端正在接收中...");

            String[] split = filepath.split("\\\\");
            String fileName = split[split.length - 1];
            String Path = "src\\qqclient\\service\\data\\sharefiles\\";
            String saveFilePath = Path  + fileName;
            File file;
            if (!(file = new File(Path)).exists()) {
                boolean mkdirs = file.mkdirs();
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileSocket.getInputStream());

            FileOutputStream fileOutputStream = new FileOutputStream(saveFilePath);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int readLen;
            byte[] buf = new byte[1024];
            bufferedInputStream.skip(4);
            while ((readLen = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf, 0, readLen);
            }
            System.out.println("接收端接收完成...");
            bufferedOutputStream.close();
            bufferedInputStream.close();
            fileSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDestUserId() {
        return destUserId;
    }

    public void setDestUserId(String destUserId) {
        this.destUserId = destUserId;
    }

    public Socket getFileSocket() {
        return fileSocket;
    }

    public void setFileSocket(Socket fileSocket) {
        this.fileSocket = fileSocket;
    }
}
