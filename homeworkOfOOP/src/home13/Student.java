package home13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name,sex,age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String study(){
        return "我承诺，我会好好学习.";
    }

    public String play(){
        return super.play() + "足球.";
    }

    @Override
    public String toString() {
        return "学生的信息: " + "\n" +
                super.toString() +
                "学号: " + this.stu_id + "\n" +
                this.study() + "\n" +
                this.play() + "\n" +
                "------------------------";
    }
}
