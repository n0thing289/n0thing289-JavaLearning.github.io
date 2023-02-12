package home13;

public class Person {
    private String name;
    private char sex;
    private int age;

    Person() {

    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return this.name + "爱玩";
    }

    @Override
    public String toString() {
        return "姓名: " + this.getName() + "\n" +
                "年龄: " + this.getAge() + "\n" +
                "性别: " + this.getSex() + "\n";
    }

    public void showPerson(Person p) {
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println(s.toString());
        }
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            System.out.println(t.toString());
        }
    }

    public void sortingPersonArr(Person[] pArr) {
        Person temp = null;
        for (int i = 0; i < pArr.length - 1; i++) {
            for (int j = 0; j < pArr.length - 1 - i; j++) {
                if (pArr[j].getAge() < pArr[j + 1].getAge()) {
                    temp = pArr[j];
                    pArr[j] = pArr[j + 1];
                    pArr[j + 1] = temp;
                }
            }
        }
    }
}
