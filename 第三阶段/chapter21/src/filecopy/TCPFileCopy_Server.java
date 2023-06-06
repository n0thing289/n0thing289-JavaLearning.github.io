package filecopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPFileCopy_Server {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字(转为监听, 绑定ip和端口)
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 等待连接
        Socket socket = serverSocket.accept();
        System.out.printf("客户端<%s:%d>已连接%n", socket.getLocalAddress(), socket.getLocalPort());
        //3. 收发数据
        //3.1 接受图片
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream socket_bis = new BufferedInputStream(inputStream);

        String filepath = "src\\socket_tcp\\filecopy\\copy2.jpg";
        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

        byte[] buf = new byte[1024];
        int readLen;
        while ((readLen = socket_bis.read(buf)) != -1) {
            bos.write(buf, 0, readLen);
        }
        System.out.println("服务器接受完成!");
        //3.2 发送"收到图片"
        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();
        //4. 关闭流和套接字
        bw.close();
        bos.close();
        socket_bis.close();
        socket.close();
        serverSocket.close();
    }
}
