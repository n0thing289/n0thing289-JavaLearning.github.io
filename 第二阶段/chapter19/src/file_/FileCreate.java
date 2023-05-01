package file_;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01(){
        String filepath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\news1.txt";
        File file = new File(filepath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02(){
        File parentFile = new File("H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\");
        String filename = "news2.txt";
        File file = new File(parentFile, filename); //这步只是在内存中创建了File对象,但是还是和硬盘没有关系
        try {
            file.createNewFile();//这步才是真正底层在硬盘创建文件
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03(){
        String parentPath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\";
        String filePath = "news03.txt";

        File file = new File(parentPath, filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
