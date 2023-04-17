package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee e1 = new Employee("a", 10000, "001");
        Employee e2 = new Employee("b", 20000, "002");
        Employee e3 = new Employee("c", 15000, "003");
        Employee e4 = new Employee("d", 11000, "004");
        Employee e5 = new Employee("e", 20000, "005");

        map.put(e1.getId(), e1);
        map.put(e2.getId(), e2);
        map.put(e3.getId(), e3);
        map.put(e4.getId(), e4);
        map.put(e5.getId(), e5);

        Set keyset = map.keySet();
        for (Object key : keyset) {
            Employee e = (Employee) map.get(key);
            double salary = e.getSalary();

            System.out.print(salary > 18000 ? e + "\n" : "");
        }
        System.out.println("第二种遍历方式");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Employee e = (Employee) map.get(key);
            double salary = e.getSalary();

            System.out.print(salary > 18000 ? e + "\n" : "");
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private String id;


    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
