package review02;

public class TestThrows {
    public static void main(String[] args) {
        new Test().f2();
    }
}
class Test{
    public void f1() throws NullPointerException{
        System.out.println("抛出异常");
//        return new RuntimeException("制造异常");
//        throw new NullPointerException();
    }
    public void f2(){
        System.out.println("f2().. start");
        try {
            f1();
        } catch (Exception e) {
            System.out.println("捕获异常");
        }
        System.out.println("f2().. stop");
    }

//    public void test(){
//        int n1 =10;
//        if(true){
//            int n1 = 10;
//        }
//    }
}
