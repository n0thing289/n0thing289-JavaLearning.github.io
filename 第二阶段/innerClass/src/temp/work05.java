package temp;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        while(true){
            if(Bill.amount == -1){
                break;
            }
            Bill.main();
            System.out.println("balance:" + Bill.balance);
        }
    }
    public static class Bill {
        private static double balance;
        private static int amount;
        public static void main(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入一个整数金额");
            amount = scanner.nextInt();
            balance += amount;
            if(balance >= 10){
                balance -= 10;
                System.out.println("支付成功！\n"+
                        "找零："+ (amount - 10) +"元\n" +
                        "正在打印......\n" +
                        "出票成功！\n"
                );
            }
            else{
                double chajia = 10 - balance;
                System.out.println("金额不足。 还需要"+chajia+"$");
            }
        }
    }

}

