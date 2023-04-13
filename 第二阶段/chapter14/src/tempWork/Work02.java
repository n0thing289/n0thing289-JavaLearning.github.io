package tempWork;

@SuppressWarnings({"all"})
public class Work02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        //assuem the max number
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxNum = max(maxNum, arr[i]);
        }
        System.out.println(maxNum);
    }

    public static int max(int x1, int x2) {
        return x1 > x2 ? x1 : x2;
    }
}
