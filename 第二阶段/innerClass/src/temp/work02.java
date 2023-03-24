package temp;
import java.util.Scanner;
public class work02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

//        System.out.println("");
        for(int i = 0;i < 3;i++){
            System.out.print("输入第 "+ (i + 1) +" 个整数：");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        max = max > arr[1] ? max : arr[1];
        max = max > arr[2] ? max : arr[2];

        System.out.println("最大的整数是：" + max);
    }
}
