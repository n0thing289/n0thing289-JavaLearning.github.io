package StringBuffer;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "hello tom";

        //第一种 使用构造器创建对象,返回的才是StringBuilder,对原本的str没有影响
        StringBuffer stringBuffer = new StringBuffer(str);

        //第二种 先创建一个空的StringBuilder,再append()
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //StringBuilder -> String
        //第一种 用StringBuffer的toString()
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        stringBuffer2.toString();

        //第二种 使用String的构造器
        String s = new String(stringBuffer2);

    }
}
