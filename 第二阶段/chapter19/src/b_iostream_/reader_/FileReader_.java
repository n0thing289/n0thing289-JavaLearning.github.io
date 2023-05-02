package iostream_02.reader_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        //1. 创建流
        //2. 准备路径
        //3. 处理流
        //4. 关闭流
    }

    public void readFile01() {
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\reader_\\";
        String file = "凡人修仙传仙界篇2.txt";
        String filepath = path + file;

        FileReader fileReader = null;
        int read = 0;
        try {
            fileReader = new FileReader(filepath);
            while ((read = fileReader.read()/**每次读单个字符, 返回int(二进制->int->char), 读完后返回-1*/) != -1) {
                System.out.print((char) read);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void readFile02() {
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\reader_\\";
        String file = "凡人修仙传仙界篇2.txt";
        String filepath = path + file;

        FileReader fileReader = null;
        char[] cuf = new char[10];
        int readlen = 0;
        try {
            fileReader = new FileReader(filepath);
            while ((readlen = fileReader.read(cuf)/**每次读自定义多个字符放入cuf字符数组, 返回每次实际读取的长度(10), 读完后返回-1*/) != -1) {
                System.out.print(new String(cuf, 0, readlen));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
