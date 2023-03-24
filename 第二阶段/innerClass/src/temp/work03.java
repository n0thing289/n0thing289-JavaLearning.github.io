package temp;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your grade:");
        int grade = scanner.nextInt();

        if(grade <= 100){
            if(grade >= 90) {
                System.out.println("A");
            }
            else if (grade >=80) {
                System.out.println("B");
            }
            else if (grade >= 70) {
                System.out.println("C");
            }
            else if (grade >=60) {
                System.out.println("D");
            }
            else if(grade >=50){
                System.out.println("E");
            }
        }
        else{
            System.out.println("输入成绩有误");
        }
    }
}
