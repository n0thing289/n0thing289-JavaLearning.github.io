package file_;

import org.junit.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String parentPath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\";
        String filePath = "news03.txt";

        File file = new File(parentPath, filePath);
        if(file.exists()){
            if (file.delete()) {// 有返回值
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }
    }

    //
    //在java编程中,目录其实也是一种文件
    @Test
    public void m2(){
        String parentPath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\";
        String filePath = "demo02";

        File file = new File(parentPath, filePath);
        if(file.exists()){
            if (file.delete()) {/**有返回值*/
                System.out.println("删除目录成功");
            }else {
                System.out.println("删除目录失败");
            }
        }else {
            System.out.println("该目录不存在");
        }
    }

    @Test
    public void m3(){
        String parentPath = "H:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\file_\\";
        String filePath = "demo02\\a\\b";

        File file = new File(parentPath, filePath);
        if(file.exists()){
            System.out.println("该目录已经存在");
        }else {
            if(file.mkdirs()){/** mkdirs() 是创建多级目录*/
                System.out.println("目录创建成功");
            }else {
                System.out.println("目录创建失败");
            }
        }
    }
}
