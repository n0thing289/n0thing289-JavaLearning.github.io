package api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机的InetAddress对象的ip地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //2. 指定主机名 获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("imamh");
        System.out.println(host1);

        //3. 根据域名返回InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        //4. 通过对象反向获取对应地址
        System.out.println(host2.getHostAddress());

        //5. 通过对象获取主机名/域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名：" + hostName);
    }
}
//1. 创建套接字
//2. 绑定套接字
//3. 变为监听模式
//4. 等待连接
//5. 收发数据
//6. 关闭套接字