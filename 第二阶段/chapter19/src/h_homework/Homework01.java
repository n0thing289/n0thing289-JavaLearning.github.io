package h_homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        String path = "src\\h_homework\\";
        String file = "mytemp";
        String filepath = path + file;
        //2. 创建流
        File file1 = new File(filepath);
        //3. 处理流
        if (file1.exists()) {
            System.out.println("目录" + filepath + "已经存在");
        } else {
            if (file1.mkdir()) {
                System.out.println("目录" + filepath + "创建成功");
            } else {
                System.out.println("创建" + filepath + "失败");
            }
        }

        String newPath = filepath + "\\";
        String newFile = "hello.txt";
        String newFilePath = newPath + newFile;
        File file2 = new File(newFilePath);

        if (file2.exists()) {
            System.out.println("文件" + newFilePath + "已经存在");
        } else {
            if (file2.createNewFile()) {
                System.out.println("文件" + newFilePath + "创建成功");
                FileWriter fileWriter = new FileWriter(newFilePath);
                fileWriter.write("hello world~");
                fileWriter.close();
            } else {
                System.out.println("创建失败");
            }
        }
    }
}
