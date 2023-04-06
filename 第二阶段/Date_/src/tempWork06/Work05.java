package tempWork06;

import java.util.Arrays;

public class Work05 {
    public static void main(String[] args) {
        Integer[][] arr = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {10, 11, 13}};
        //假设最大
        int max = arr[0][0];
        for(int i = 0;i< arr.length;i++){

            for(int j = 0;j<arr[i].length;j++){//跳过第一个的第一个元素

                max = arr[i][j] > max ? arr[i][j] : max;
            }
        }
        System.out.println(max);
    }
}
