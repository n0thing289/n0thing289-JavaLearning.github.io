package home04;

public class Homework04 {
    public static void main(String[] args) {
        departmentManager manager = new departmentManager("hwk", 200, 10, 1.2);
        manager.printSalary();
//        employee manager2 = new departmentManager("hwk", 200, 10, 1);
//        manager2.printSalary();
        worker worker = new worker("hww1wk", 440, 100, 1);
        worker.printSalary();

    }
}



class departmentManager extends Employee {
    public departmentManager(String name, double day_money, int work_days, double grade) {
        super(name, day_money, work_days, grade);
    }

    public double calSalary() {
        double salary = 1000 + getDay_money() * getWork_days() * getGrade();
        return salary;
    }

    public void printSalary() {
        super.printSalary();//动态绑定!
        // (为什么我说这里用动态绑定?因为我调用了父类的printSalary(),在这其中又调用了calSalary(),
        // 此时父类也有calSalary(),问我这里没有用向上转型哦那么调用子类的还是父类的?)
    }
}

class worker extends Employee {
    public worker(String name, double day_money, int work_days, double grade) {
        super(name, day_money, work_days, grade);
    }

    public double calSalary() {
        double salary = getDay_money() * getWork_days() * getGrade();
        return salary;
    }

    public void printSalary() {
        super.printSalary();
    }
}