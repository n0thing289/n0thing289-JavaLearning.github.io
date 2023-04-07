import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
//        str.charAt(0);
//        System.out.println();
        str = String_.reverse(str, 0, 4);
        System.out.println(str);
    }
}

class String_{
    public static String reverse(String str,int start,int end){// start = 1 end = 5
        //1. 创建一个新的字符数组，将反转部分的内容先接收
        //2. 将旧字符串的部分删去
        //3. 插入旧字符串到start位置

        if(!(str.length() > end && start >= 0 && str != null)){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
//        StringBuffer newArr = new;
        char temp = ' ';
        for (int i = start, j = end; i < j; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
