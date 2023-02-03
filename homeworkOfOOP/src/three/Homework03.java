package three;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("joey", 18, "高级", 10000,1.3);
        associateProfessor associateProfessor = new associateProfessor("chandle", 19, "中级", 8000, 1.2);
        Lecturer lecturer = new Lecturer("pheebe", 20, "初级", 7000, 1.1);

        System.out.println(professor.introduce());
        System.out.println(associateProfessor.introduce());
        System.out.println(lecturer.introduce());
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;
    Teacher(String name,int age,String post,double salary,double grade){
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce(){
        return "我的名字是："+name+" 年龄为"+age+" 职称为"+post+" 基本工资是"+salary + " grade:" + grade;
    }
}
class Professor extends Teacher{

    Professor(String name,int age,String post,double salary,double grade){
        //记得复习继承细节!!!
        //因为Professor工资高
        super(name,age,post,salary,grade);
    }

    //重写细节
    public String introduce(){
        return super.introduce();
    }

}
class associateProfessor extends Teacher{
    associateProfessor(String name,int age, String post,double salary,double grade){
        super(name,age,post,salary,grade);
    }

    public String introduce(){
        return super.introduce();
    }
}
class Lecturer extends Teacher{
    Lecturer(String name, int age, String post, double salary,double grade){
        super(name, age, post, salary,grade);
    }
    public String introduce(){
        return super.introduce();
    }
}