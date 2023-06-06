package socket_tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCP03_Client {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字(+ 连接服务器)
        Socket socket = new Socket("192.168.43.191", 9999);
        //2. 收发数据
        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        osw.write("你好客户端~");
        osw.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        int readLen;
        char[] cbuf = new char[1024];
        while((readLen = isr.read(cbuf)) != -1){
            System.out.println(new String(cbuf,0,readLen));
        }
        //3. 关闭套接字
        osw.close();
        isr.close();
        socket.close();
    }
}
/**
 * 注意, 字符流每次写的时候,会先放在缓冲区, 满了或者调用close()/flush()才会真正写入!
 * */