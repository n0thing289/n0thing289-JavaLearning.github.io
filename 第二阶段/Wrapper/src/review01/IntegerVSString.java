package review01;

public class IntegerVSString {
    public static void main(String[] args) {
        Integer i = 10;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);
//        String str4 = new String(i);//String()构造器不接受int

        String str = "123456";
        Integer i1 = Integer.parseInt(str);
        Integer i2 = Integer.valueOf(str);
        Integer i3 = new Integer(str);
    }
}
