package h_homework;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        String path = "src\\h_homework\\";
        String file = "dog.properties";
        String filepath = path + file;
        //2. 创建流
        FileReader fileReader = new FileReader(filepath);
        Properties properties = new Properties();
        //3. 处理流-用Properties包装字符流
        properties.load(fileReader);
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, Integer.parseInt(age), color);
        System.out.println(dog);


        // 序列化
        //1. 准备路径
        String serialPath = "src\\h_homework\\";
        String serialFile = "dog.dat";
        String serialFilePath = serialPath + serialFile;
        //2. 创建流
        FileOutputStream fileOutputStream = new FileOutputStream(serialFilePath);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        //3. 写入 可序列化对象
        oos.writeObject(dog);
        //4. 关闭
        oos.close();


    }
    @Test
    public void read() throws IOException, ClassNotFoundException {
        //反序列化
        //1. 准备路径
        String serialPath = "src\\h_homework\\";
        String serialFile = "dog.dat";
        String serialFilePath = serialPath + serialFile;
        //2. 创建流
        FileInputStream fileInputStream = new FileInputStream(serialFilePath);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        //3. 读取
        Object o = ois.readObject();
        if(o instanceof Dog){
            Dog d = (Dog)o;
            System.out.println(d);
        }
        //4. 关闭
        ois.close();
    }


}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
