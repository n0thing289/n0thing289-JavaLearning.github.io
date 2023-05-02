package a_file_;

import org.junit.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        String parentPath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\";
        String filePath = "news03.txt";

        File file = new File(parentPath, filePath);

        System.out.println("文件名字=" + file.getName());

        //absPath
        System.out.println("文件绝对路径 = " + file.getAbsoluteFile());
        //父级目录
        System.out.println("文件腹肌目录 = " + file.getParentFile());
        //wenjiandaxiao
        System.out.println("文件大小(字节) = " + file.length());
        //
        System.out.println("文件是否存在 = " + file.exists());
        //
        System.out.println("是不是一个文件 = " + file.isFile());
        //
        System.out.println("是不是一个目录 = " + file.isDirectory());
    }


}
