public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;


        //当执行到num1 / num2 因为分母不能为了，会抛出异常 ArithmeticException
        // 当抛出异常后，程序就退出，下面的代码不再执行
        // 其实不太严重，就导致整个程序再次停止，这样不好
        //java设计者提供了一个叫 异常处理机制来解决该问题

        //如果程序员，任务一段代码可能出现异常/问题，可以使用try-catch异常处理机制解决
        //ctrl alt t 选好一段代码,快速生成try-catch
        try{
            int res = num1 / num2;
        }catch(Exception e){
//            e.printStackTrace();//如果真的有问题,这行会输出打印,程序继续往下走
            System.out.println(e.getMessage());//输出异常的原因
        }

        System.out.println("程序继续运行");
    }
}
