package b_iostream_.writer_;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        //1. 创建流
        //2. 准备路径和变量
        //3. 处理流
        //4. 关闭流
//        writeFile01();
    }
    @Test
    public void writeFile01(){
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\writer_\\";
        String file = "a.txt";
        String filepath = path + file;

        FileWriter fileWriter = null;
        char[] cbuf = {'a','b', 'c', 'd'};
        try {
            fileWriter = new FileWriter(filepath);
            /**写入单个字符*/
            fileWriter.write('z');
            /**写入多个字符*/
            fileWriter.write(cbuf);
            /**写入字符串*/
            fileWriter.write("风雨过后, 必定彩虹");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                /**看源码, 知为什么要close()或者flush();这是因为close底层才是真正写入文件的*/
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
