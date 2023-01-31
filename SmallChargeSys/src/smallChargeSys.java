import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/*
    老韩的重要思想:
        1. 一段代码只实现一个小功能
        2. 条件判断时,找不正确的条件
 */
public class smallChargeSys {
    //1.
    public static void main(String[] args) {
        boolean flag = true;
        short choice;
        //完成入账相关的变量
        String details = "----------零钱通明细----------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        //消费相关的变量
        String shoppingName;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n\n----------零钱通菜单----------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消     费");
            System.out.println("\t\t4 退     出");

            System.out.print("请选择（1-4）:");
            choice = scanner.nextShort();

            switch (choice) {
                case 1:
                    System.out.println(details);
                    System.out.println("----------------------------");
                    break;
                case 2:
                    while (true) {
                        System.out.print("收益入账金额:");
                        money = scanner.nextDouble();
                        //money的应该校验
                        if (money < 0) {
                            balance += money;
                            date = new Date();
//                    System.out.println(sdf.format(date));
                            //添加进details
                            details += "\n收益入账:\t+" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                            System.out.println("----------------------------");
                            break;

                        } else {
                            System.out.println("入账失败你的输入有误,请重新输入!");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.print("消费金额:");
                        money = scanner.nextDouble();
                        if (balance >= money) {
                            System.out.print("消费说明:");
                            shoppingName = scanner.next();
                            date = new Date();
                            balance -= money;
                            details += "\n" + shoppingName + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                            System.out.println("----------------------------");
                            break;
                        } else {
                            System.out.println("余额不足无法消费,请重新输入");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("你确定要退出吗?(y/n)");
                        if ("y".equals(scanner.next())) {
                            break;
                        }
                    }
                    System.out.println("----------退出----------");
                    flag = false;
                    break;
                default:
                    System.out.println("输入有误请重新输入!");
            }

        } while (flag);
    }
}
