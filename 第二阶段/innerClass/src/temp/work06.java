package temp;

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        GuessNum guessNum = new GuessNum();
        guessNum.guess();
    }
}
class GuessNum{
    private static int x;
    private static Scanner scan = new Scanner(System.in);
    private static int playerInt;

    public void guess(){
        x = (int)(Math.random()*100);

        while(true){
            System.out.print("输入你猜的数字：");
            playerInt = scan.nextInt();
            if(playerInt > x){
                System.out.println("大了");
            }
            else if(playerInt < x){
                System.out.println("小了");
            }
            else{
                System.out.println("猜对了,恭喜你，正确！");
                break;
            }
        }

    }
}
