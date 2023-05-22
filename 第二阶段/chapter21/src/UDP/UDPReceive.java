package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //1. 创建一个对象,准备接收数据(绑定端口)
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 创建DatagramPacket对象
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3. 调用接收方法
        System.out.println("等待接收数据");
        socket.receive(packet);//代表我会在9999端口等待收数据
        //4. 拆包
        byte[] data = packet.getData();
        int length = packet.getLength();
        String s = new String(data, 0, length, StandardCharsets.UTF_8);
        System.out.println(s);
        //5. 关闭套接字
        socket.close();

    }
}
