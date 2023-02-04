package five;

import four.Employee;

public class Worker extends Employee {
    Worker(String name, double day_money, int work_days, double grade){
        super(name, day_money, work_days, grade);
    }
    public double calSalary(){
        double salary = getDay_money()*getWork_days()*getGrade();
        return salary;
    }

    public void printSalary(){
        System.out.print("工人");
        super.printSalary();
    }
}
