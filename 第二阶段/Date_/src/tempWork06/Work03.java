package tempWork06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] scores = new Double[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学员成绩:");
            scores[i] = scanner.nextDouble();
        }
        Arrays.sort(scores, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double d1 = (Double) o1;
                double d2 = (Double) o2;
                double res = d1 - d2;
                if (res > 0) {
                    return 1;
                } else if (res == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println(Arrays.toString(scores));
    }
}
