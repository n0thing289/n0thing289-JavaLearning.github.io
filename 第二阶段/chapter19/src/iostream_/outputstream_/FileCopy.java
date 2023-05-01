package iostream_.outputstream_;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    //1. 创建流
    //2. 准备路径
    //3. 处理
    //4. 关闭


    public static void main(String[] args) {
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\outputstream_\\";
        String file = "img012.jpg";
        String oldFilePath = path + file;
        String newFilePath = path + "copy.jpg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[1024];

        int readLen = 0;
        try {

            fileInputStream = new FileInputStream(oldFilePath);
            fileOutputStream = new FileOutputStream(newFilePath, true);
            // 1. 每次读取8个字节放到字符数组,然后立马在新文件中写入字符数组的8个字节,直到读完(-1)
            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);//必须用这个 -- 原理是读出来的二进制放入字符数组， 如果不是1024，则会从索引0开始覆盖595个，此时如果还是用wirte不给定范围写入，会写多594后面重复的二进制
                System.out.println(readLen);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}


