package generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a",2000,new MyDate(1,2,2000)));
        employees.add(new Employee("a",3000,new MyDate(2,4,2001)));
        employees.add(new Employee("a",4000,new MyDate(3,4,2001)));

        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName() == o2.getName()){
                    return o2.getBirthday().compareTo(o1.getBirthday());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}' + "\n";
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o){
        if (this.year != o.year){
            return this.year - o.year;
        }
        else{
            //一样就判断月份
            if (this.month != o.month){
                return this.month - o.month;
            }
            else {
                //月份一样就判断天
                return this.day - o.day;
            }
        }
    }
}
/**
 *      //
 *      new Comparator<Employee>() {
 *             @Override
 *             public int compare(Employee o1, Employee o2) {
 *                 if (!(o1 != null && o2 != null)){
 *                     throw new RuntimeException("类型不正确");
 *                 }
 *                 //辅助变量
 *                 int o1year = o1.getBirthday().getYear();
 *                 int o2year = o2.getBirthday().getYear();
 *                 int o1month = o1.getBirthday().getMonth();
 *                 int o2month = o2.getBirthday().getMonth();
 *                 int o1day = o1.getBirthday().getDay();
 *                 int o2day = o2.getBirthday().getDay();
 *                 if(o1.getName() == o2.getName()){
 *                     //按日期排序
 *                     //如果年不一样
 *                     if (o1year != o2year){
 *                         return o1year - o2year;
 *                     }
 *                     else{
 *                         //一样就判断月份
 *                         if (o1month != o2month){
 *                             return o1month - o2month;
 *                         }
 *                         else {
 *                             //月份一样就判断天
 *                             return o1day - o2day;
 *                         }
 *                     }
 *                 }
 *
 *                 return o1.getName().compareTo(o2.getName());
 *             }
 *         }
 */