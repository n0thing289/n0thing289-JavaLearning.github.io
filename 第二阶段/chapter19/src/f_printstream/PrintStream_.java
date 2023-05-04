package f_printstream;

import java.io.IOException;
import java.io.PrintStream;

/**字节打印流*/
public class PrintStream_ {//字节打印流
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("hello john");
        /**
         * 在默认情况下，打印（输出数据）的位置是显示器（标准输出）
         * */
        //因为底层还是用write
        out.write("hsp".getBytes("utf-8"));
        out.close();

        //修改打印流输出的位置
        String path = "src\\f_printstream\\";
        String file = "f1.txt";
        String filepath = path + file;
        /**public static void setOut(PrintStream out) {
         checkIO();
         setOut0(out);
         }*/
        System.setOut(new PrintStream(filepath));// native方法setOut0(out); 改变输出的位置
        System.out.println("hello, 韩顺平教育");
    }
}
