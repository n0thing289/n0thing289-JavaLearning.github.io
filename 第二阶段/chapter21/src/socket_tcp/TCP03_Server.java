package socket_tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//与第二个案例的内容大致一致，只不过要求使用字符流
public class TCP03_Server {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字(+ 变为监听模式,绑定端口)
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 等待连接
        Socket new_s = serverSocket.accept();
//        System.out.println("客户端已连接此服务器<" + new_s.getLocalAddress() +":"+ new_s.getLocalPort() + ">");
        //3. 收发数据
        InputStream inputStream = new_s.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        int readLen;
        char[] cbuf = new char[1024];
        while ((readLen = isr.read(cbuf)) != -1){
            System.out.println(new String(cbuf, 0 ,readLen));
        }

        OutputStream outputStream = new_s.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(outputStream);
        osw.write("你好客户端!");
        osw.flush();
        new_s.shutdownOutput();

        //4. 关闭流和套接字
        osw.close();
        isr.close();
        new_s.close();
        serverSocket.close();
    }
}
