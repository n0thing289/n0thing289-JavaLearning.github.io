package temp;
import java.util.Scanner;
public class work01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数金额");
        int amount = scanner.nextInt();
        if(amount > 10){
            System.out.println("支付成功！\n"+
                    "找零："+ (amount-10) +"元\n" +
                    "正在打印......\n" +
                    "出票成功！\n"
            );
        }
        else{
            System.out.println("金额不足。");
        }
    }
}
