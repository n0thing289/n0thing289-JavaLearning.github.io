package homework;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Homework02 {
    public static void main(String[] args) {

    }
}

class UDPClient01 {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字（只写端口）
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        //2. 封装数据包
        byte[] bytes = "四大名著是哪些".getBytes(StandardCharsets.UTF_8);//做成用户输入问题
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
        //3. 发送数据包
        datagramSocket.send(datagramPacket);
        //3.2 接受响应
        byte[] respond = new byte[1024];
        DatagramPacket res = new DatagramPacket(respond, respond.length);
        datagramSocket.receive(res);
        //3.3 将响应拆包
        byte[] data = res.getData();
        int length = res.getLength();
        System.out.println(new String(data, 0, length, StandardCharsets.UTF_8));
        //4. 关闭套接字
        datagramSocket.close();
    }
}

class UDPServer01 {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        //2. 接受数据
        byte[] firstRes = new byte[1024];
        DatagramPacket res = new DatagramPacket(firstRes, firstRes.length);
        datagramSocket.receive(res);
        //2.1 拆包
        byte[] data = res.getData();
        int length = res.getLength();
        String str = new String(data, 0, length, StandardCharsets.UTF_8);
        //2.2 判断数据做出响应
        byte[] sendToRes;
        if ("四大名著是哪些".equals(str)) {
            sendToRes = "四大名著是《红楼梦》《水浒传》《西游记》《三国演义》".getBytes(StandardCharsets.UTF_8);
        }else{
            sendToRes = "what".getBytes(StandardCharsets.UTF_8);
        }
        //2.3 给客户端发送响应
        DatagramPacket datagramPacket = new DatagramPacket(sendToRes, sendToRes.length, InetAddress.getLocalHost(), 6666);
        datagramSocket.send(datagramPacket);
        //3. 关闭套接字
        datagramSocket.close();
    }
}
