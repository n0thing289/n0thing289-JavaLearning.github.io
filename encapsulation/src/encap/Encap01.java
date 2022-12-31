package encap;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("joey");
        person.setAge(20);
        person.setSalary(200000);
        System.out.println(person.info());
    }
}


class Person {
    public String name;
    private int age;
    private double salary;

    public Person(){}
    public Person(String name, int age, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }




    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            this.name = "undefined name";
            System.out.println("请检查名字长度，也给定默认值");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            this.age = 18;
            System.out.println("年龄不对，已给定默认年龄");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0 && salary <= 100000){
            this.salary = salary;
        }
        else{
            this.salary = 1000;
            System.out.println("这里是小县城，最高不过100000/月，已给定你默认值");
        }

    }

    public String info() {
        return "name: " + this.name + "  age: " + this.age + "  salary: " + this.salary;
    }
}