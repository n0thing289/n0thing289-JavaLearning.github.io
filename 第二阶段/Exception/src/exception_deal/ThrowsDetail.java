package exception_deal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    //编译异常必须你先用异常处理(tcf/throw)处理好
    //运行时异常，在运行的时候如果没有trycatch，发现有异常，就会默认抛出调用者
    public static void main(String[] args) {
        f2();
    }

    public static void f2(){
        int n1 = 10;
        int n2 = 0;
        int res =  n1 / n2;
    }

    public static void f1(){
        try {
            f3();
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("not file");
        }
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://a.txt");
    }

    public static void f4(){//throws ArithmeticException
        f5();
        //运行时异常（运行异常）不要求从需求显式处理，因为运行的时候默认有处理机制（给调用者来一个throws）
    }
    public static void f5() throws ArithmeticException{

    }
}
class Father{
    public void method() throws RuntimeException{

    }
}
class son extends Father {
    @Override
    public void method() throws NullPointerException{
        //要么一样要是是父类RuntimeException要么是RuntimeException的子类异常类型

    }
}