public class IntegerVSString {
    public static void main(String[] args) {
        //Integer -> String
        Integer i = 10;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        //String -> Integer
        String str4 = "123456";
        Integer i1 = Integer.parseInt(str4);
        Integer i2 = Integer.valueOf(str4);//
        Integer i3 = new Integer(str4);
        System.out.println(i2);
    }
}
