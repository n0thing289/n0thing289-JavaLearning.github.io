package qqclient.view;

import qqclient.service.UserClientService;
import qqcommon.User;

import java.io.IOException;
import java.util.Scanner;

public class UI {

    private boolean loop = true;
    //标题字符串属性
    public static final String titleV1 = "==========欢迎登录网络通信系统==========";
    public static final String functionType =
            "\t\t\t1 登录系统\n" +
                    "\t\t\t9 退出系统\n";

    public static final Scanner scan = new Scanner(System.in);
    public String receivedUserChose;
    public String receivedUserId;
    public String receivedUserPassword;

    //二级菜单
    public String titleV2;
    public static final String functionTypeV2 =
            "\t\t\t1 显示在线用户列表\n" +
                    "\t\t\t2 群发消息\n" +
                    "\t\t\t3 私聊消息\n" +
                    "\t\t\t4 发送文件\n" +
                    "\t\t\t9 退出系统\n";

    private UserClientService userClientService = new UserClientService();//该对象用于登录服务/注册用户
    public void showUIv1() throws IOException, ClassNotFoundException {
        while (loop) {
            System.out.println(titleV1);
            System.out.println(functionType);

            System.out.print("请输入你的选择： ");
            receivedUserChose = scan.next();

            switch (receivedUserChose) {
                case "1":
                    System.out.print("请输入用户号：");
                    receivedUserId = scan.next();
                    System.out.print("请输入密码：");
                    receivedUserPassword = scan.next();
                    //TODO 这里需要到服务端取验证是否合法
                    if (userClientService.checkUser(receivedUserId,receivedUserPassword)) {//
                        showUIv2();//显示二级菜单
                    }else {
                        System.out.println("登录服务器失败");
                    }
                    break;
                case "9":
                    System.out.println("退出系统。。。");
                    loop = false;
                    break;
            }
        }
    }

    public void showUIv2() {
        /*二级菜单*/
        while (loop) {
            titleV2 = "==========网络通信系统二级菜单（用户 " + receivedUserId + "）==========";
            System.out.println("\n" + titleV2);
            System.out.println(functionTypeV2);

            System.out.print("请输入你的选择： ");
            receivedUserChose = scan.next();
            switch (receivedUserChose){
                case "1":
                    System.out.println("显示在线用户列表");
                    break;
                case "2":
                    System.out.println("群发消息");
                    break;
                case "3":
                    System.out.println("私聊消息");
                    break;
                case "4":
                    System.out.println("发送文件");
                    break;
                case "9":
                    System.out.println("退出系统");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，重新输入？");
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new UI().showUIv1();
    }
}
