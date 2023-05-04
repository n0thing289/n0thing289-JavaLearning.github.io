package review.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1. 准备路径
        String path = "src\\review\\obj\\";
        String file = "reviewObj.dat";
        //2. 创建对象处理流
        FileInputStream fileInputStream = new FileInputStream(path + file);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        //3. 读取对象
        Object o = ois.readObject();
        Person p;
        if(o instanceof Person){
            p = (Person)o;
            System.out.println(p.getName() + " = " + p.getAge());
            System.out.println(p.getClass());
        }

        //4. 关闭流
        ois.close();
        System.out.println("读取完毕");
    }
}
