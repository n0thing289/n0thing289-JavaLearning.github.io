package UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(6666);
        //2. 将要发送的数据封装到DatagramPacket
        byte[] bytes = "hello, 明天吃火锅~".getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost()/**InetAddress.getByName("")*/, 9999);
        //3. 发送数据
        socket.send(packet);
        //4. 关闭套接字
        socket.close();
    }

}
