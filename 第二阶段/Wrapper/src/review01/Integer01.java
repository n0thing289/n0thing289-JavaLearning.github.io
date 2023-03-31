package review01;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;

        //手动
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        int n2 = integer.intValue();


        //自动
        Integer integer2 = n1;// -> Integer.valueOf(n1);

        int n3 = integer2;// -> integer2.intValue();
    }
}
