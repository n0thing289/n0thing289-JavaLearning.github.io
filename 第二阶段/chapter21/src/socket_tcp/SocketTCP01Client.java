package socket_tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1. 连接服务器(ip, port)
        //  连接成功返回Socket对象
        Socket socket = new Socket("192.168.43.191", 9999);
        //2. 连接上之后,生成一个socket, 通过socket.getOutputStream()
        //  得到和Socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3. 在这个输出流通道中 写入数据
        outputStream.write("hello".getBytes(StandardCharsets.UTF_8));
        //4. 关闭流和套接字
        outputStream.close();
        socket.close();
    }
}
