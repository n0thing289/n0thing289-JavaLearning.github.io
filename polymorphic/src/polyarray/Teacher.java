package polyarray;

public class Teacher extends Person{
    private double salary;
    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }
    public String say(){
        return "teacher:"+super.say()+" salary = " + salary;
    }
    public void teach(){
        System.out.println("老师"+ name + "正在授课");
    }
}
