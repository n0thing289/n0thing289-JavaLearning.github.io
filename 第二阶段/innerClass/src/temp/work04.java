package temp;

import java.util.Scanner;

public class work04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a int:");
        int x = scanner.nextInt();

        for(int i = x;i>1;i--){
            x *= i-1;
        }
        System.out.println(x);
    }
}
