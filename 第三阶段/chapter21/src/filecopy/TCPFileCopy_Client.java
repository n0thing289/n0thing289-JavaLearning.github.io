package filecopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileCopy_Client {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字(对方ip, 端口)
        String ip = String.valueOf(InetAddress.getLocalHost());
        int port = 9999;
        Socket socket = new Socket(ip, port);
        System.out.println("连接服务器成功!");
        //2. 收发数据
        //2.1 读本地的图片//2.2 发图片
        String filepath = "src\\socket_tcp\\filecopy\\xxx.jpg";
        FileInputStream fileInputStream = new FileInputStream(filepath);
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);

        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream socket_bos = new BufferedOutputStream(outputStream);

        byte[] buf = new byte[1024];
        int readLen;
        while ((readLen = bis.read(buf)) != -1) {
            socket_bos.write(buf, 0, readLen);
        }
        socket_bos.flush();
        socket.shutdownOutput();
        //2.3 接受对方的消息
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        int readLen2;
        char[] cbuf = new char[1024];
        while ((readLen2 = br.read(cbuf)) != -1) {
            System.out.println(new String(cbuf, 0, readLen2));
        }
        //3. 关闭套接字
        br.close();
        socket_bos.close();
        bis.close();
        socket.close();

    }
}
