package extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println(name + "正在考大学数学");
    }

    public void showinfo() {
        System.out.println("名字： " + name + "  年龄： " + age + "  分数： " + score);
    }
}
