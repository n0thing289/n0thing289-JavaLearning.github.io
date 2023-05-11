package review.transformation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        //2. 创建流
        //3. 写入
        //4. 关闭流
        String filepath = "src\\review\\transformation\\change.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream, "utf-8");

        osw.write("你好韩顺平老师");

        osw.close();
        /**
         * 这一段的目的其实是你想把字符串写入到文件,以gbk的方式
         * 除了这样用转换流,还可以直接用字节流 + write("".getBytes(charset))
         * */
    }
}
