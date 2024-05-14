package extend_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println(name + "正在考小学数学");
    }

    public void showinfo() {
        System.out.println("名字： " + name + "  年龄： " + age + "  分数： " + score);
    }
}
