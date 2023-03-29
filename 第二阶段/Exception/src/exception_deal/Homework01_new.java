package exception_deal;

public class Homework01_new {
    public static double cal(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        try{
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException();
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);
            System.out.println("计算结果：" + res);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("参数个数不对");
        }catch(NumberFormatException e){
            System.out.println("请输入正确的数据格式");
        }catch(ArithmeticException e){
            System.out.println("分母为0了!");
        }


    }
}
