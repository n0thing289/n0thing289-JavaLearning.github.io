package tempWork06;

import java.util.Arrays;
import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入十个人的成绩:");
        String input = scanner.next();
        String[] split = input.split(",");

        double[] scores = new double[split.length];
        for (int i = 0; i < scores.length; i++) {
            //转换
            scores[i] = Double.parseDouble(split[i]);
        }
        double allScores = 0;
        double average = 0;
        for (int i = 0; i < scores.length; i++) {
            allScores += scores[i];
        }
        //输出平均分
        average = allScores / scores.length;
        System.out.println("平均分:" + average);
        //准备存放数据
        double[] highThanAverage = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                highThanAverage[i] = scores[i];
            }
        }
        //输出高于平均分的
        System.out.println("高于平均分的:" + Arrays.toString(highThanAverage));
    }
}
