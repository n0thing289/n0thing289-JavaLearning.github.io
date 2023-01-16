import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        //演示执行到下一个断点
        int[] arr = {1, 3, 5, 2, 56, 6, 23, 6, 10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("666");
        System.out.println("666");
        System.out.println("666");
        System.out.println("666");
        System.out.println("666");
        System.out.println("666");

    }
}
