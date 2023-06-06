package homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

    }
}

class TCPClient02 {
    public static void main(String[] args) throws IOException {

        //Scanner
        //1. 接受用户输入
        String needFileName;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你想要的文件名： ");
        needFileName = scan.next();
        //tcp
        //1. 创建套接字
        System.out.println("正在连接服务器");
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("服务器连接成功！");
        //2. 收发数据，
        //2.1 将需要的文件名发给服务器
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
        BufferedWriter bufferedSocketWriter = new BufferedWriter(outputStreamWriter);
        bufferedSocketWriter.write(needFileName);
        bufferedSocketWriter.flush();
        socket.shutdownOutput();
        //2.2 接受服务器传来的数据
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedSocketInputStream = new BufferedInputStream(inputStream);

        String path = "src\\homework\\testdest\\" + needFileName;
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int readLen;
        byte[] bytes = new byte[1024 * 1000000];
        while ((readLen = bufferedSocketInputStream.read(bytes)) != -1) {
            //2.3 保存到本地
            bufferedOutputStream.write(bytes, 0, readLen);
        }
        //3. 关闭流和套接字
        bufferedOutputStream.close();
        bufferedSocketInputStream.close();
        bufferedSocketWriter.close();
        socket.close();
    }

}

class TCPServer02 {
    public static void main(String[] args) throws IOException {
        //1. 创建套接字
        ServerSocket serverSocket = new ServerSocket(8888);
        //2. 等待连接
        System.out.println("服务器等待连接");
        Socket socket = serverSocket.accept();
        System.out.printf("客户端<%s, %d>已连接\n", socket.getLocalAddress(), socket.getLocalPort());
        //3. 收发数据
        //3.1 接收文件名
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int readLen;
        char[] cbuf = new char[1024];
        String needFileName = null;
        while ((readLen = bufferedReader.read(cbuf)) != -1) {
            needFileName = new String(cbuf, 0, readLen);
        }
        //3.2 根据文件名尝试打开文件， 然后读取发送回客户端； 如果没有就返回默认的音乐
        String path = "E:\\思想道德法治实践作业\\video\\朱志成\\" + needFileName;
        System.out.println("文件查找中");
        if (needFileName != null) {
            //3.2.1 读取文件
            FileInputStream fileInputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedSocketOutputStream = new BufferedOutputStream(outputStream);

            int readLen02;
            byte[] data = new byte[1024 * 1000000];

            while ((readLen02 = bufferedInputStream.read(data)) != -1) {
                //3.2.2 发送文件
                bufferedSocketOutputStream.write(data, 0, readLen02);
            }
            bufferedSocketOutputStream.flush();
            socket.shutdownOutput();

            bufferedSocketOutputStream.close();
            bufferedInputStream.close();
        }else {
            System.out.println("未查询到你想要的文件");
        }
        //4. 关闭套接字
        socket.close();
        bufferedReader.close();
        serverSocket.close();
    }

}
