package review.obj.obj2;

import java.io.*;

public class ObjectOutputStream02 {
    public static void main(String[] args) throws IOException {
        //1. 准备路径
        //2. 创建流，对象处理流是包装流，需要前置的节点流
        //3. 写入一个实现了串行化接口的对象
        //4. 关闭流
        String filepath = "src\\review\\obj\\obj2\\review.dat";

        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        Dog dog = new Dog("abc", 19);
        oos.writeObject(dog);

        oos.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}