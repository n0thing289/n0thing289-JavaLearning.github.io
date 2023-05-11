package review.obj.obj2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1. 准备路径
        //2. 创建流
        //3. 读取流
        //4. 关闭流
        String filepath = "src\\review\\obj\\obj2\\review.dat";

        FileInputStream fileInputStream = new FileInputStream(filepath);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);

        Object o = ois.readObject();
        if (o instanceof Dog){
            Dog dog = (Dog)o;
            System.out.println(dog);
        }

        ois.close();
    }
}
