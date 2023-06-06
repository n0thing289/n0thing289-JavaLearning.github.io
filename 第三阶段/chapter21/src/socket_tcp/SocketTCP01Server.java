package socket_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1. 在本机9999端口监听，等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 会一直等待客户端连接阻塞在这里,除非客户端连接上
        Socket socket = serverSocket.accept();

        //3. 创建输入流通道, 为后面读取数据做准备(这里会阻塞)
        InputStream inputStream = socket.getInputStream();

        //4. 读取数据
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //5. 关闭流和套接字
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
