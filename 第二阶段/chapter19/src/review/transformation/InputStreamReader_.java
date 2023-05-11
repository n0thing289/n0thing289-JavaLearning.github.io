package review.transformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        //2. 创建流
        //3. 写入
        //4. 关闭流
        String filepath = "src\\review\\transformation\\change.txt";

        FileInputStream fileInputStream = new FileInputStream(filepath);
        InputStreamReader isr = new InputStreamReader(fileInputStream);
        int read;//4个字节, 十进制表示字节
        while ((read = isr.read()) != -1) {
            System.out.print((char) read);
        }
        isr.close();
        /**转换流采用一种称为“字符集”的规则将字节转换为字符及字符转换为字节*/
    }
}
