package polyparameter;

public class PolyParameter {
    public void showEmpAnnual(Employee e) {//这里如果不用多态,你要写好多个showEmployee()
        System.out.println(e.getAnnual());//动态绑定
    }

    public void testWork(Employee e) {
        if (e instanceof normalEmployee) {
            ((normalEmployee) e).work();
        } else if (e instanceof manager) {
            ((manager) e).manage();
        }
    }

    public static void main(String[] args) {
        PolyParameter p = new PolyParameter();

        Employee norEmp = new normalEmployee("1", 1000);
        Employee manager = new manager("2", 10000, 1000);


        p.showEmpAnnual(norEmp);
        p.showEmpAnnual(manager);
        p.testWork(norEmp);
        p.testWork(manager);
    }
}

class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnual() {
        return salary * 12;
    }
}

class normalEmployee extends Employee {
    public normalEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("working~");
    }

    public double getAnnual() {
        return salary * 12;
    }
}

class manager extends Employee {
    private double bonus;

    public manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("managing~");
    }

    public double getAnnual() {
        return salary * 12 + bonus;
    }
}
