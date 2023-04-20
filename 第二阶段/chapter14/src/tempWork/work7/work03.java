package tempWork.work7;

public class work03 {
    public static void main(String[] args) {
        Person zwf = new Person("zwf", 100, 1.8, 250);
        zwf.check();
        zwf.out();
    }
}
class Person{
    private String name;
    private int age;
    private double height;
    private double weight;
    private String level;
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void check(){
        //normal
        double level = weight / height*height;
        if (level > 18 && level <25){
            this.level =  "正常体重";
        }
        else if (level < 18) {
            this.level =  "偏瘦";
        }
        else{
            this.level =  "偏胖";
        }
    }
    public void out(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", level='" + level + '\'' +
                '}';
    }
}
