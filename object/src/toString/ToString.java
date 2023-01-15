package toString;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("xiaoming", "巡山", 1000);
        System.out.println(monster.toString());
        System.out.println(monster.hashCode());
        System.out.println(monster);//等价于monster.toString()
    }

}


class Monster{
    private String name;
    private String job;
    private double salary;
    Monster(String name, String job, double salary){
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    //重写toString()

//    @Override
//    public String toString() {//重写后,一般是把对象的属性输出
//        return "Monster{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}