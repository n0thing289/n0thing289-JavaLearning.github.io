package tempWork;

import java.util.Scanner;

public class work04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入成绩");
        String s = scanner.next();
        String[] split = s.split(",");

        double[] grades = new double[split.length];
        //
        for(int i = 0;i<split.length;i++){
            grades[i] = Double.parseDouble(split[i]);
        }
        double sum = 0;
        double average =0;
        for(int i = 0;i< grades.length;i++){
            sum += grades[i];
        }
        average = sum/grades.length;
        System.out.println("5门总分= " + sum + "\t 平均分= " + average);
    }
}
//4.录入5门课程成绩。计算输出平均分。（用for循环）


