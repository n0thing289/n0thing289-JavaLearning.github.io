public class MathMethod {
    public static void main(String[] args) {
        //1. abs()
        System.out.println(Math.abs(-100));

        //2. pow
        System.out.println(Math.pow(2,4));

        //3. ceil()
        System.out.println(Math.ceil(3.1) + "    " + Math.ceil(-3.1));

        //4. floor()
        System.out.println(Math.floor(3.1) + "    " + Math.floor(-3.1));

        //5. round()
        System.out.println(Math.round(5.4));

        //6. sqrt() 开平方
        System.out.println(Math.sqrt(9));

        //7. random()
        System.out.println(Math.random());

        // 求2-7的随机整数
        double randomNum = 2 + (int)(Math.random() * (7-2)) + 1;
        System.out.println(randomNum);



    }
}
