package com.hspedu.pkg;
import java.util.Arrays;
//注意：
//老韩建议只导入要用到的类，尽量别全导入

import java.util.Scanner;//只导入Scanner类
import java.util.*;//表示将util包下所有类导入

public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 3, 13, 2};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
