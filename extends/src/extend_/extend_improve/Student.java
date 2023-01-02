package extend_.extend_improve;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showinfo() {
        System.out.println("名字： " + name + "  年龄： " + age + "  分数： " + score);
    }
}
