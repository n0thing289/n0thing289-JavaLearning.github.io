package home13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public String teach(){
        return "我承诺,我会认值教学.";
    }
    public String play(){
        return super.play() + "象棋.";
    }

    @Override
    public String toString() {
        return "老师的信息: " + "\n" +
                super.toString() +
                "工龄: " + this.work_age + "\n" +
                this.teach() + "\n" +
                this.play() + "\n" +
                "------------------------";
    }
}
