import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
//        long l =299999999999999999999999L;
//        System.out.println("l = " + l);

        //BigInteger
        //定义
        BigInteger bigInteger = new BigInteger("23999999999999999999");
        System.out.println(bigInteger);

        BigInteger bigInteger2 = new BigInteger("100");


        //方法来加减乘除
        //加
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);

        //减
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);

        //乘
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);

        // 除
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);

    }
}
