package equals_.exercises;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Object p1 = new Person("xiaoming", 18, 'm');
        Object p2 = new Person("xiaoming", 18, 'm');
//        Object p2 = new Person("jack", 20, 'w');
        System.out.println(p1.equals(p2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    //重写equals
    public boolean equals(Object p) {//访问权限一样或变大，返回类型要么一样要么是父类返回类型的子类，方法名一样，形参列表一样
        if (this == p) {//先判断两个地方是不是同一个对象（同一个数据空间）
            return true;
        }
        if (p instanceof Person) {
            Person ptest = (Person) p;
            if (this.name.equals(ptest.getName()) && this.age == ptest.getAge() && this.gender == ptest.getGender()) {
                return true;
            }
            //下一行是老韩的做法
//            return this.name.equals(ptest.getName()) && this.age == ptest.getAge() && this.gender == ptest.getGender();
        }

//        if(this.name == getName() && this.age == getAge() && this.gender == getGender()){
//            return true;
//        }

        return false;
    }
}
