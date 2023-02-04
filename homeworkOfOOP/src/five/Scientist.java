package five;

import four.Employee;

public class Scientist extends Employee {
    private double bonus;
    public Scientist(String name, double day_money, int work_days, double grade) {
        super(name, day_money, work_days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calSalary() {
        double salary = bonus + super.calSalary();
        return salary;

    }

    @Override
    public void printSalary() {
        System.out.print("科学家");
//        super.printSalary();
        System.out.println("名字:" +getName() + "\t\t" + "单日工资:" +getDay_money() + "\t\t" + "工作天数:" +getWork_days() + "\t\t" + "等级:" +getGrade() + "\t\t" + "工资:"+ calSalary() +"(含奖金:"+bonus+")");

    }
}
