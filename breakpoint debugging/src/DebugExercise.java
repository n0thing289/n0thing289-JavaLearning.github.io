public class DebugExercise {
    public static void main(String[] args) {
        //加载类信息（classLoader.java）
        //初始化： 默认初始化 显式初始化 构造器初始化
        Person xiaoming = new Person("xiaoming", 18);
        System.out.println(xiaoming);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
