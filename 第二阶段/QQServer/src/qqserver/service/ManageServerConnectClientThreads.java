package qqserver.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ManageServerConnectClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    public static void addServerConnectClientThread(String userId,ServerConnectClientThread serverConnectClientThread){
        hm.put(userId, serverConnectClientThread);
    }

    //根据id,返回对应的ServerConnectClientThread线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }


    public static String getOnlineUsers(){
        StringBuilder users = new StringBuilder();

        Set<Map.Entry<String, ServerConnectClientThread>> entries = hm.entrySet();

        Iterator<Map.Entry<String, ServerConnectClientThread>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, ServerConnectClientThread> next = iterator.next();
            //添加到一个字符串里面
            users.append(next.getKey());
            users.append(" ");
        }
        return users.toString();
    }

    public static void removeServerConnectClientThread(String userId){
        hm.remove(userId);
    }
}
