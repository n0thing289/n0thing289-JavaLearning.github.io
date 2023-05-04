package f_printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {//字符打印流
    public static void main(String[] args) throws IOException {

//        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("src\\f_printstream\\f1.txt"));
        printWriter.println("hi 北京你好");
        printWriter.close();//flush + 关闭流

    }
}
