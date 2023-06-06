package qqserver.login;

import java.io.*;
import java.util.HashMap;

public class tempStoreUserData {
    public static void main(String[] args) throws IOException {
        String path = "src\\qqserver\\data\\loginServerData\\";
        String filePath = path + "user.dat";
        //用HashMap去存用户数据
        //1. 创建文件目录
        File file = new File(filePath);
        if(!(file.exists())){
            if (file.mkdirs()) {
                System.out.println("第一次进行服务器数据库初始化");;
            }
        }

        //2. 存 100:10086, 这一个用户
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        String userId = "100";
        String userPassword = "10086";
        stringStringHashMap.put(userId, userPassword);
        //3. 写入dat文件
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(stringStringHashMap);
        objectOutputStream.close();
    }
}
