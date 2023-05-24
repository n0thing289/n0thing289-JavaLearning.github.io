package homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Homework01 {
    public static void main(String[] args) {

    }
}

class TCPClient01 {
    public static void main(String[] args) throws IOException {
        //1. 创捷套接字
        Socket socket = new Socket(InetAddress.getLocalHost(), 10086);
        //2. 收发数据
        //2.1 第一次发数据
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("hobby");//这里其实要做成用户输入
        bufferedWriter.flush();
        socket.shutdownOutput();
        //2.2 接受服务器响应的数据
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int readLen;
        char[] cbuf = new char[1024];
        while((readLen = bufferedReader.read(cbuf)) != -1){
            System.out.println(new String(cbuf,0,readLen));
        }
        //3. 关闭流和套接字
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}

class TCPServer01 {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字（绑定端口）
        ServerSocket serverSocket = new ServerSocket(10086);
        //2. 等待连接
        System.out.println("服务器等待连接");
        Socket accept = serverSocket.accept();
        System.out.printf("客户端<%s,%d>%n 连接成功", accept.getLocalAddress(), accept.getLocalPort());
        //3. 收发数据
        //3.1 第一次收数据
        InputStreamReader inputStreamReader = new InputStreamReader(accept.getInputStream(), StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int readLen;
        char[] cbuf = new char[1024];
        System.out.println(">>>");
        StringBuilder str = new StringBuilder();
        while ((readLen = bufferedReader.read(cbuf)) != -1) {
            str.append(new String(cbuf, 0, readLen));
        }
        //3.2 判断接受的内容，做出不同的响应
        String respondSTR;
        if("name".equals(str.toString())){
            respondSTR = "我是nova";
        } else if ("hobby".equals(str.toString())) {
            respondSTR = "编写java程序";
        }else {
            respondSTR = "你说啥捏？";
        }
        //3.3 向客户端发送响应的字符串
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(accept.getOutputStream(), StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(respondSTR);
        bufferedWriter.flush();
        accept.shutdownOutput();
        //4. 关闭流和套接字
        bufferedReader.close();
        bufferedWriter.close();
        accept.close();
        serverSocket.close();
    }
}