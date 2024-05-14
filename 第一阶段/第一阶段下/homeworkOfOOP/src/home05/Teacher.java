package home05;

import home04.Employee;

public class Teacher extends Employee {
    private int classDay;
    private double classSalary;
    public Teacher(String name, double day_money, int work_days, double grade,int classDay,double classSalary) {
        super(name, day_money, work_days, grade);
        this.classDay = classDay;
        this.classSalary = classSalary;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    @Override
    public double calSalary() {
        double salary = (classDay*classSalary) + super.calSalary();
        return salary;

    }

    @Override
    public void printSalary() {
        System.out.print("老师");
        System.out.println("名字:" +getName() + "\t\t" + "单日工资:" +getDay_money() + "\t\t" + "工作天数:" +getWork_days() + "\t\t" + "等级:" +getGrade() + "\t\t" + "工资:"+ calSalary() +"(基本工资:"+super.calSalary()+"|讲课费"+((classDay*classSalary))+"上课天数"+classDay+" 单课费用"+classSalary+")");

    }
}
