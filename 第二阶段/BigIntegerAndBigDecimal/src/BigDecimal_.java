import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 1.3412412412321312312312312312d;
        System.out.println(d);

        //想要精度很高，用这个
        BigDecimal bigDecimal = new BigDecimal("1991.11231231211111111111111");

        BigDecimal bigDecimal2 = new BigDecimal("1.1");

        // 加
        System.out.println(bigDecimal.add(bigDecimal2));
        // 减
        System.out.println(bigDecimal.subtract(bigDecimal2));
        // 乘
        System.out.println(bigDecimal.multiply(bigDecimal2));
        // 除
//        System.out.println(bigDecimal.divide(bigDecimal2));//可能抛出ArithmeticException异常（除不尽的情况：无限循环小数）
        //在divide调用时指定精度即可就不会可能异常
        //如果除不尽，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
