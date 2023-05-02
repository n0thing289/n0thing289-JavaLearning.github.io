package e_transformation;

import java.io.*;

/**
 * 把 FileOutputStream 字节流转成字符流 OutputStreamWriter
 * */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\transformation\\";
        String file = "hsp.txt";
        String filepath = path + file;
        String charSet = "gbk";
        //1. 准备路径
        //2. 创建字符转换输出流,包装字节输出流
        //3. 指定编码方式
        //4. 写入
        //5. 关闭外层流
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filepath), charSet);

        outputStreamWriter.write("hi, 韩顺平教育");
        outputStreamWriter.close();
        System.out.println("按照 "+ charSet +" 保存文件成功");

    }
}
