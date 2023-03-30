package tempWork;
import java.util.Scanner;
public class work01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入一个正整数：");
        String x = scan.next();
        //TODO
        int x2 = Integer.parseInt(x);
        int i = x2;
        while(true){
            if(i > 1){//4*3*2
                x2 = x2 * (i-1);//4*3
                i--;
            }
            else{
                break;
            }
        }
        System.out.println(x2);

    }
}
