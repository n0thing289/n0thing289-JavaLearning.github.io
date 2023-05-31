package qqserver.login;

//import org.junit.Test;
import qqcommon.Message;
import qqcommon.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


/**
 * 与客户端的登录验证有关功能
 * */
public class LoginIdentify {

    public void toClientLoginIdentify() throws IOException, ClassNotFoundException {
        //1. 接收并保存dat数据包
        //1.2 创建套接字，关闭套接字
        ServerSocket serverSocket = new ServerSocket(8080);
        //1.3 等待连接
        System.out.println("服务器正在等待连接");
        Socket socket = serverSocket.accept();
        System.out.printf("服务器已连接客户端<%s, %d>\n",socket.getLocalAddress(),socket.getLocalPort());
        //1.4 收发数据: 将数据包读取，进行反序列化
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream ois_socket = new ObjectInputStream(inputStream);
        Object userDatObject = ois_socket.readObject();
        System.out.println(userDatObject);
        User user;
        if(!(userDatObject instanceof User)){
            System.out.println("将来这里传给客户端， 发送的不是用户dat数据包");
        }else {
            user = (User) userDatObject;
            //3. 读出来的数据与本地数据库对比信息
            String userId = user.getUserId();
            String  userPassword = user.getPassword();
            //3.1 查询数据库
            boolean b = searchUser(userId,userPassword);
            if(!b){
                System.out.printf("数据库没有记录%s 用户\n", userId);
            }else {
                //4. 如果是已经注册的用户， 封装信息到一个Message对象
                System.out.printf("%s 用户登录成功!\n", userId);
                String sender = socket.getLocalAddress().toString();
                String getter = serverSocket.getLocalSocketAddress().toString();
                System.out.println(sender);
                System.out.println(getter);
            }
        }
        //5. 发送Message对象
    }

    public boolean searchUser(String id,String password) throws IOException, ClassNotFoundException {
        String path = "src\\qqserver\\data\\loginServerData\\";
        String filePath = path + "user.dat";
        //1. 创建对象流
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //2. 读取HashMap对象
        Object obj;
        obj = objectInputStream.readObject();
        if(obj instanceof HashMap){
            HashMap userHashMap = (HashMap)obj;
            //3. 判断如果有这用户,且当前密码与id下的密码一样返回true
            return userHashMap.containsKey(id) && password.equals(userHashMap.get(id));
        }
        return false;
    }

}
