package review.obj;

import java.io.*;

public class ObjectOutputStream01 {

    public static void main(String[] args) throws IOException {
        //1. 准备路径
        String path = "src\\review\\obj\\";
        String file = "reviewObj.dat";
        String filepath = path + file;

        //2. 创建一个对象处理流
        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        //3. 将其序列化写入
        Person zwf = new Person(18, "zwf");
        oos.writeObject(zwf);

        //4. 关闭流
        oos.close();
        System.out.println("写入对象成功");
    }
}

class Person implements Serializable {
    private int age;
    private String name;
//    private BB bb = new BB();//属性都要实现了Serializable接口

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BB{}