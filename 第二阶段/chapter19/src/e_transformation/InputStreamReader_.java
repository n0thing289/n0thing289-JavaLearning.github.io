package e_transformation;

import java.io.*;

/**
 * 将字节流转换成字符流*/
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {

        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\transformation\\";
        String file = "a.txt";
        String filepath = path + file;

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath), "gbk");
        //1. 把FileInputStream 转成 InputStreamReader
        //2. 指定编码
        //3. 把 InputStreamReader 传入 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //4. 读取
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5. 关闭外层流
        bufferedReader.close();
    }
}
