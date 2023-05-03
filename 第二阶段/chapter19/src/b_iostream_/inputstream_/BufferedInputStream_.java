package b_iostream_.inputstream_;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_ {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        String filepath = "src\\b_iostream_\\inputstream_\\a.txt";
        //2. 创建包装流，对FileInputStream包装
        FileInputStream fileInputStream = new FileInputStream(filepath);
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        //3. 读取
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = bis.read(buf))  != -1){
            System.out.print(new String(buf, 0, readLen));
        }
        //4. 关闭流
        bis.close();
    }
}
/**
 * 字节流对中文都无法支持，对英文是最好支持的
 * */
