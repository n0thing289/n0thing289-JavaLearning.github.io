package home01;

public class Homework01 {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 1, "csgo");
        Person p2 = new Person("p2", 2, "csgo");
        Person p3 = new Person("p3", 3, "csgo");


        Person[] arr = p1.sorting(p1, p2, p3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());

        }
//        System.out.println(arr[0]);
//        System.out.println(arr[0].getName());
//        Test test = new Test();

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void setName(){
        this.name = name;
    }
    public void setAge(){
        this.age = age;
    }
    public void setJob(){
        this.job = job;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getJob(){
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public Person[] sorting(Person... p) {
        //调用后会把当前对象跟形参对象一起比较age
        //返回一个从大到小的数组

        // 5 4 3 2 1
        // 43215   4
        // 32145   3
        // 21345   2
        // 12345   1

        // 1 2 3 4 5
        // 23451  4
        // 34521  3
        // 45321  2
        // 54321  1
        //1. 先将可变参数遍历，复制给新数组
        Person[] Arr = new Person[p.length];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = p[i];
        }
        //2. 将新数组根据对象的age属性进行冒泡排序
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = 0; j < Arr.length - 1 - i; j++) {
                if (Arr[j].age < Arr[j + 1].age) {
                    Person temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        //3. 将排序后的新数组返回
        return Arr;
    }
}
