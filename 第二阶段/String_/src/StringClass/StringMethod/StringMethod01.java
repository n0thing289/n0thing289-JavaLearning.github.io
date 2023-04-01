package StringClass.StringMethod;

public class StringMethod01 {
    public static void main(String[] args) {
        //1. equals() 区分大小写
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false



        //2. equalsIgnoreCase()不区分大小小写
        String username = "john";
        if("john".equalsIgnoreCase(username)){
            System.out.println("success!");// success!
        }
        else{
            System.out.println("Failure!");
        }

        //3. length() 返回字符串的长度
        System.out.println("韩顺平".length());//3

        //4. indexOf() 获取字符从字符串对象中第一次出现的索引,找不到就返回-1
        String s1 = "wer@terwe@g";
        int index = s1.indexOf('@');
        System.out.println(index);//3
        System.out.println("weindex=" + s1.indexOf("we"));//weindex=0

        //5. lastIndexOf() 返回在字符串中最后一次出现的索引,索引从0开始
        s1 = "wer@terwe@g@";
        index = s1.lastIndexOf('@');
        System.out.println(index);//11
        System.out.println("ter的位置=" + s1.lastIndexOf("ter"));//ter的位置=4

        //6. substring() 截取指定范围的字符串
        String name = "hello,张三";
        System.out.println(name.substring(6));// 从索引6开始一直往后截取 //张三
        System.out.println(name.substring(2,5));// 从0开始截取到第5个之前一个 左闭右开//llo


        /**
         * 细节1:
         *
         */
    }
}

