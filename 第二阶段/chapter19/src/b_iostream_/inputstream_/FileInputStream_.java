package b_iostream_.inputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

//字节输入流
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    //用read(), 读取数据
    @Test
    public void readFile01() {
        String filePath = "src\\iostream_\\inputstream_\\hello.txt";
        int read;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象, 用于读取文件
            fileInputStream = new FileInputStream(filePath);
            /**读取一个字节的数据, 如果读到结尾了返回-1*/
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //用read(byte[] b) 读文件
    @Test
    public void readFile02() {
        String filePath = "src\\iostream_\\inputstream_\\hello.txt";
        int readLen = 0;
        FileInputStream fileInputStream = null;

        //定义字节数组
        byte[] buf = new byte[8];// 表示一次读8个字节
        try {
            //创建FileInputStream对象, 用于读取文件
            fileInputStream = new FileInputStream(filePath);
            /**每次读取byte数组的长度的数据, 如果读到结尾了返回-1, 如果读取正常返回实际读取的字节数*/
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));/**这个构造器后面的范围offset,表示取出byte数组范围(左闭右开)内构成字符串*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
