package exercise;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary){
        super(name, id, salary);
    }
    public String work(){
        return "普通员工 " + getName() + "工作中";
    }
}
