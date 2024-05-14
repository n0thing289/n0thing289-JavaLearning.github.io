package home04;

public class Employee {

    private String name;
    private double day_money;
    private int work_days;
    private double grade;


    public Employee(String name, double day_money, int work_days, double grade) {
        this.name = name;
        this.day_money = day_money;
        this.work_days = work_days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDay_money() {
        return day_money;
    }

    public void setDay_money(double day_money) {
        this.day_money = day_money;
    }

    public int getWork_days() {
        return work_days;
    }

    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double calSalary() {
        //计算基本工资
        double salary = day_money*work_days*grade;
        return salary;
    }

    public void printSalary() {
        System.out.println("名字:" +name + "\t\t" + "单日工资:" +day_money + "\t\t" + "工作天数:" +work_days + "\t\t" + "等级:" +grade + "\t\t" + "工资:"+ calSalary());
//        System.out.println("\t\t" +name + "\t\t" + day_money + "\t\t" + work_days + "\t\t" + grade + "\t\t" + calSalary());
    }

}
