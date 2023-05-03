package b_iostream_.outputstream_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedCopy_ {
    public static void main(String[] args) throws Exception {
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\outputstream_\\";
        String file = "img012.jpg";
        String oldFilePath = path + file;
        String newFile = "copy.jpg";
        String newFilePath = path + newFile;

        FileInputStream fileInputStream = new FileInputStream(oldFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(newFilePath);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        /**一个一个读*/
        int readDataLen;
        byte[] buf = new byte[1024];
        while ((readDataLen = bufferedInputStream.read(buf)) != -1) {
            bufferedOutputStream.write(buf, 0, readDataLen);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
