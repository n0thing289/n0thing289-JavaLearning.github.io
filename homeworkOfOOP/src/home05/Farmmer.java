package home05;

import home04.Employee;

public class Farmmer extends Employee {
    Farmmer(String name, double day_money, int work_days, double grade){
        super(name, day_money, work_days, grade);
    }

    @Override
    public double calSalary() {
        double salary = getDay_money()*getWork_days()*getGrade();
        return salary;
    }

    @Override
    public void printSalary() {
        System.out.print("农民");
        super.printSalary();
    }
}
