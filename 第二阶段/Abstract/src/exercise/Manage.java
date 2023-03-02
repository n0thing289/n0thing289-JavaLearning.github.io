package exercise;

public class Manage extends Employee{
    private double bonus;
    public Manage(String name, int id, double salary, double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String work(){
        return "经理 " + getName() + "工作中";
    }
}
