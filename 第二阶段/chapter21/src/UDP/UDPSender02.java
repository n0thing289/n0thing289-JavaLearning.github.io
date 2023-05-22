package UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSender02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. 创建套接字
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        //2. 创建包对象并封装
        byte[] senderData = "hello, 明天吃火锅".getBytes(StandardCharsets.UTF_8);
        DatagramPacket senderPacket = new DatagramPacket(senderData, senderData.length, InetAddress.getLocalHost(), 9999);
        //3. 发送
        datagramSocket.send(senderPacket);
        Thread.sleep(5000);
        //3.2 接收回复
        //3.2.1 创建包对象用于接收
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        //3.2.2 调用接收
        datagramSocket.receive(receivePacket);
        //3.2.3 拆包
        byte[] data = receivePacket.getData();
        int length = receivePacket.getLength();
        String s = new String(data, 0, length, StandardCharsets.UTF_8);
        System.out.println(s);
        //4. 关闭
        datagramSocket.close();
    }
}
