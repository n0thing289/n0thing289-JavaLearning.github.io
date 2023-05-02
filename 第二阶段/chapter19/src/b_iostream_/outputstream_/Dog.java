package iostream_02.outputstream_;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;

    //只有static transient不会被序列化
    private static String nation;
    private transient String color;

    //serialVersionUID
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                ", nation=" + nation +
                '}';
    }
}