package exception_deal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws FileNotFoundException, NullPointerException, Exception{

//        try {// 可以使用trycatch处理异常
                // 是一个FileNotFoundException编译异常
//            FileInputStream fileInputStream = new FileInputStream("d://a.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        FileInputStream fileInputStream = new FileInputStream("d://a.txt");

    }
}
