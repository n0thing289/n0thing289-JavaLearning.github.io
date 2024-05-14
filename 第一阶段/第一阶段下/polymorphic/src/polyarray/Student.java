package polyarray;

public class Student extends Person{
    private double score;
    public Student(String name, int age, double score){
        super(name, age);
        this.score = score;
    }
    public String say(){
        return "student:" + super.say() +" score = "+ score;
    }

    public void study(){
        System.out.println("学生" + name + "正在上课");
    }
}
