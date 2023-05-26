package qqclient.service;

import java.util.HashMap;

/**
 * 管理客户端连接到服务端线程的类
 */
public class ManageClientConnectServerThread {
    //把多线程放入HashMap集合, key就是用户id,value就是线程
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    //把线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread){
        hm.put(userId, clientConnectServerThread);
    }

    //取出HashMap中对应id的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
