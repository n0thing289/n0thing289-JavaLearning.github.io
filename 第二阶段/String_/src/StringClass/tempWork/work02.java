package StringClass.tempWork;

import java.util.Scanner;

public class work02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入两个数:");
        String s = scanner.next();
        String[] split = s.split(",");

        double m = Double.valueOf(split[0]);
        double n = Double.valueOf(split[1]);

        double r;
        do{
             r = n%m;
             //
             m = n;
             n = r;

        }while(r!=0);
        System.out.println("r=0, 最大公约数是= " + m);
    }
}
