package set.hashset_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        MyDate date01 = new MyDate(2000, 12, 12);
        Employee2 xiaoming = new Employee2("xiaoming", 20, date01);

        MyDate date02 = new MyDate(2000, 12, 12);
        Employee2 xiaoming2 = new Employee2("xiaoming", 20, date01);//第二个，如果这里写date01以及我只对Employee的equals和hashCode重写时，其实还是添加的是一个；那么为什么呢？


        HashSet hashSet = new HashSet();
        hashSet.add(xiaoming);
        hashSet.add(xiaoming2);
        System.out.println(hashSet);//第一个不熟是，输出哈希表的时候是先把所有元素调用toString返回的字符串一个一个拼起来的
        //在一个的基础，如果把MyDate和Employee2都重写了equals和hashCode方法，那么即使我写的时date02，那么结果就是输出一个
    }
}

class Employee2{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee2(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return age == employee2.age && Objects.equals(name, employee2.name) && Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

