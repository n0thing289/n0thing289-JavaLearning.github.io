public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.WINTER);
    }
}

// 自定义枚举
class Season{
    private String name;
    private String desc;

    //定义四个对象,static + final 进行优化
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("球天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    //1. 私有化构造器,防止直接new
    //2. 取掉set,防止修改属性
    //3. 在这个类内部创建固定的对象
    private Season(String name, String  desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}