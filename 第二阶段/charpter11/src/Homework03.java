import java.util.Arrays;

public class Homework03 {
    public static void main(String[] args) {
        String str = "Han Shun Ping";
        str = "Huang Wei Kai";
//        String[] s = str.split(" ");//[Han, Shun, Ping]
//        System.out.println(Arrays.toString(s));
//
//        s[2] = s[2] + ",";
//        System.out.println(s[2]);
//
        System.out.println(format(str));

    }


    public static String  format(String str){
        //1.接受一个字符串
        //2. 分割处理
        String[] s = str.split(" ");
        //3. 处理最后面的:加逗号
        s[2] = s[2] + ",";
        //4. 把第二个先加上句号,再传给StringBuffer,将2以后的全部删去
        s[1] = " ." + s[1];
        StringBuffer two = new StringBuffer(s[1]);
        two.delete(3, s[1].length());
        s[1] = two.toString();
        //5. 调整顺序,修改旧的字符串引用
        String temp1 = "";
        String temp2 = "";
        temp1 = s[0];
        s[0] = s[2];

        temp2 = s[1];
        s[1] = temp1;

        s[2] = temp2;

//        System.out.println(Arrays.toString(s));

        String newStr = "";
        for (int i = 0; i < s.length; i++) {
            newStr += s[i];
        }
//        System.out.println(newStr);
        return newStr;
    }
}
/**
 * 老韩思路
 * 1. 用format和charAt
 */
