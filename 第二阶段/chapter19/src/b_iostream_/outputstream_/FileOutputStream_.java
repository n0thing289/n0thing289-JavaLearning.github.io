package iostream_02.outputstream_;

import org.junit.Test;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile01(){
        String filePath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\inputstream_\\a.txt";
        //1. 创建对象
        //2. 准备文件路径
        //3. 处理流
        //4. 关闭流
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            /**如果不存在文件,则会先创建一个文件,再写入
             * 默认是覆盖源文件写入; 如果想以追加模式写入, 在构造器第二个参数写true*/
            /**写入一个字节*/
//            fileOutputStream.write('a');//char -> int
            /**写入字符串*/
            String str = "hello world";
//            fileOutputStream.write(str.getBytes());//把字符串转换成字节 类似于 python的encode()
            /**按范围写入*/
            fileOutputStream.write(str.getBytes(), 0, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
