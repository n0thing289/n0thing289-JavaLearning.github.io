package exception_deal;
import java.util.Scanner;
public class Homework01 {
}

class EcmDef{
    private static final Scanner scan = new Scanner(System.in);
    private static int[] arr = new int[2];

    public static void cal(int n1, int n2){
        try {
            int res = n1 / n2;
            System.out.println(res);
        } catch (Exception e) {
//            throw new RuntimeException(e);// 如果要有返回,必须要我抛出一个东西
            System.out.println("Exception:" + e.getMessage());
        }
    }

    public static void input(){
        System.out.print("请输入参数：");
        String str = scan.next();
        String[] split = str.split(",");
        try {
            if(split.length != 2){
                throw new XingCanQueShaoException("缺少命令行参数");
            }
            assign(split);
        } catch (XingCanQueShaoException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
    public static void assign(String[] split){
        try{
            int i = 0;
            for(String s:split){
//                System.out.println(s);
                arr[i] = Integer.parseInt(s);
                i++;
            }
            cal(arr[0], arr[1]);
        }catch(Exception e){
            System.out.println("Exception:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        input();
    }

}
class XingCanQueShaoException extends RuntimeException{// 如果这里去继承Exception而不是,RuntimeException,编译器会立马让你去处理这异常
    public XingCanQueShaoException(String Message){
        super(Message);
    }
}
