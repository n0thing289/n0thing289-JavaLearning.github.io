package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientCopeWithFileThread extends Thread{
    private String funcName = null;
    private String filepath = null;
    private String userId = null;
    private String destUserId = null;

    public ClientCopeWithFileThread() {

    }

    @Override
    public void run() {
        if ("sendFileMode".equals(funcName)){
            sendFile();
        }
        else if("receiveFileMode".equals(funcName)){
            receiveFile();
        }
        else {
            System.out.println("模式写错了");
        }
    }

    public void sendFile(){
        //把文件发送给服务器
        ClientConnectServerThread ccst = ManageClientConnectServerThreads.getClientConnectServerThread(userId);
        Socket ccstSocket = ccst.getSocket();
        //先发送 一个文件传输的消息,目的是为了让客户端开线程进行转发,
        Message preparationMsg = new Message();
        preparationMsg.setSender(userId);
        preparationMsg.setGetter(destUserId);
        preparationMsg.setContent(filepath);
        preparationMsg.setMesType(MessageType.MESSAGE_SEND_FILE);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(ccstSocket.getOutputStream());
            oos.writeObject(preparationMsg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void receiveFile(){

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
}
