package socket_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCP02_Client {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字/2. 连接客户端
        Socket socket = new Socket("192.168.43.191", 9999);
        //2. 收发数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        int readLen = 0;
        byte[] buf = new byte[1024];
        while ((readLen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        //3. 关闭流和对象
        outputStream.close();
        inputStream.close();

        socket.close();
    }

}
//输出流在哪写完，就在哪设置结束标志，要不然还是会阻塞
