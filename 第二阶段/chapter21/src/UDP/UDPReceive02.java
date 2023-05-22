package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPReceive02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. 创建套接字
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2. 创建包对象
        byte[] recvData = new byte[1024];
        DatagramPacket recvPacket = new DatagramPacket(recvData, recvData.length);
        //3. 调用接受方法
        datagramSocket.receive(recvPacket);
        //4. 拆包
        byte[] data = recvPacket.getData();
        int length = recvPacket.getLength();
        String s = new String(data, 0, length, StandardCharsets.UTF_8);
        System.out.println(s);
        Thread.sleep(5000);
        //4.2 回复"好的明天见"
        //4.2.1 创建新的用于回复的数据包
        byte[] senderP = "好的明天见".getBytes(StandardCharsets.UTF_8);
        DatagramPacket senderPacket = new DatagramPacket(senderP, senderP.length, InetAddress.getLocalHost(),6666);
        //4.2.2 发送回复数据包
        datagramSocket.send(senderPacket);
        //5. 关闭流
        datagramSocket.close();
    }
}
