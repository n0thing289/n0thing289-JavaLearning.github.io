package tempWork06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        //思路一,用arrays提供的方法(当复习)
        //思路二,for循环+if
        //思路一
        Integer[] arr = {8,4,20,100,23,34,12,88,66,9};
//        Arrays.sort(arr, new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2){
//               int i1 = (Integer)o1;
//               int i2 = (Integer)o2;
//               return i1 - i2;
//            }
//        });
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入你想查找的数:");
        int input = scanner.nextInt();
//        //二分查找
//        int index = Arrays.binarySearch(arr, input);
//        if(index <0){
//            System.out.println("未查找到你要的数字, 没有中奖");
//        }
//        System.out.println("恭喜中奖,index = " + index);
        for (int i = 0; i < arr.length; i++) {//思路二
            if(arr[i] == input){
                System.out.println("恭喜中奖,index = " + i);
            }
        }
    }
}
