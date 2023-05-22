package socket_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP02_Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. 创建套接字
        ServerSocket serverSocket = new ServerSocket(9999);

        //2. 等待连接
        Socket new_socket = serverSocket.accept();

        //3. 收发数据
        InputStream inputStream = new_socket.getInputStream();
        int readLen = 0;
        byte[] buf = new byte[1024];
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        //3.2
        OutputStream outputStream = new_socket.getOutputStream();
        outputStream.write("hello, client!".getBytes());

        new_socket.shutdownOutput();

        //4. 关闭流和套接字
        inputStream.close();
        outputStream.close();
        new_socket.close();
        serverSocket.close();
    }
}
//一开始存在一个问题就是说两个程序阻塞都不想下走
//也就是说双方都不知道对方说完了或者读取完了，那么就一直卡在那里等着对方说或者读
//因此我们需要设置一个结束标记socket.shutdownInput() / socket.shutdownOutput()
// 一开始的程序，服务端在发完数据之后就close了，不会等待客户端的响应，所以可以不设置结束标记，但是拓展的程序需要让服务端等待客户端的响应，就必须加结束标志，让服务端知道客户端什么时候发送数据结束