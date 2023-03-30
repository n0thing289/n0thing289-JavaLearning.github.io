package tempWork;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        new Game().Guess();
    }
}

class Game {
    private int random;
    private int input;
    private static final Scanner scan = new Scanner(System.in);

    public void Guess() {
        random = (int) (Math.random() * 100);
        byte flag = 0;
        do {
            System.out.print("输入你的数字(-1退出): ");
            String s = scan.next();
            input = Integer.parseInt(s);
            if (input == -1) {
                flag = -1;
            }
            if (input > random) {
                System.out.println("你输入的大了");
            } else if (input < random) {
                System.out.println("你输入的小了");
            } else if (input == random) {
                System.out.println("恭喜你猜对了");
                flag = -1;
            }
        } while (flag != -1);

    }
}
