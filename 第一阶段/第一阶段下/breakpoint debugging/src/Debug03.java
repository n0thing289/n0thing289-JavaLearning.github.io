import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        //追源代码
        int[] arr = {1, 3, 5, 2, 56, 6, 23, 6, 10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
