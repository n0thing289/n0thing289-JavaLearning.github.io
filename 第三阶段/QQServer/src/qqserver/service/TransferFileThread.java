package qqserver.service;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * 此类是每次文件发送的服务器，每有一次文件传输，就会启动一个线程
 * */
public class TransferFileThread implements Runnable{

    private String userId = null;
    private String destUserId = null;
    private Socket destSocket = null;
    private String[] name;
    private static ServerSocket serverFileSocket = null;

    static {
        try {
            serverFileSocket = new ServerSocket(8888);
            System.out.println("服务器已开启文件传输线程");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TransferFileThread() {

    }


    @Override
    public void run() {
        name = new String[]{userId, destUserId};
        boolean b = true;
        while(b){
            try {
                Socket socket = serverFileSocket.accept();
                System.out.println("客户端文件专属连接成功！");
                System.out.println(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



//        synchronized (this){
//            try {
//                System.out.println("服务器正在接收发送端的数据...");
//                BufferedInputStream bufferedInputStream = new BufferedInputStream(getSocket().getInputStream());
//
//                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(destSocket.getOutputStream());
////                FileOutputStream fileOutputStream = new FileOutputStream("src\\copy.jpg");
////                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//
////                FileInputStream fileInputStream = new FileInputStream("src\\copy.jpg");
////                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//                int readLen;
//                byte[] buf = new byte[1024];
//                while((readLen = bufferedInputStream.read(buf))!=-1){
//                    Thread.sleep(1000);
//                    bufferedOutputStream.write(buf,0,readLen);
//                }
//                bufferedOutputStream.flush();
//                destSocket.shutdownOutput();
//                System.out.println("服务器中转完成");
//                bufferedOutputStream.close();
//                bufferedInputStream.close();
//                this.getSocket().close();
//                Thread.sleep(1000000);
//                this.destSocket.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

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

    public static ServerSocket getServerFileSocket() {
        return serverFileSocket;
    }

    public static void setServerFileSocket(ServerSocket serverFileSocket) {
        TransferFileThread.serverFileSocket = serverFileSocket;

    }
    public Socket getDestSocket() {
        return destSocket;
    }

    public void setDestSocket(Socket destSocket) {
        this.destSocket = destSocket;
    }
}
