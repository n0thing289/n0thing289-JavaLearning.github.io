package homework;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class Homework05 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//p2(1002,"BB")

        set.add(new Person(1001,"CC"));
        System.out.println(set);//p2(1002 "BB") (1001 "CC")

        set.add(new Person(1001, "AA"));
        System.out.println(set);//p2(1002 "BB") (1001 "CC") (1001 "AA")
    }
}
class Person{
    public String name;
    public int num;

    public Person(int num, String name) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return num == person.num && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }
}
