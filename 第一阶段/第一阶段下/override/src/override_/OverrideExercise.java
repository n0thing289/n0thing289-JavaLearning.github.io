package override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person milan = new Person("milan", 26);
        Student joey = new Student("joey", 18, 10086, 100);
        System.out.println(milan.say());
        System.out.println(joey.say());
    }
}


class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String say() {
        return "我的名字是 " + name + "今年 " + age;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student() {

    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        setId(id);
        setScore(score);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
//        return "我的名字是 " + getName() + ",今年 " + getAge() + ",id为" + id + ",分数为" + score;
        return super.say() + ",id为" + id + ",分数为" + score;
    }
}