package review;

public class SeasonEnum {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}

enum Season{
    // 1. enum 代替class
    // 2.
    //   2.1 向外暴露变得简洁，本质上就是 public static final Season XXX = new Season("xx","xx");
    //   2.2 多个枚举常量用逗号隔开,最后一个用分号
    //   2.3 所有枚举常量必须写在第一行(第一个分号;前)
    // 3. 所有的构造器都是私有的
    SPRING("spring","warm"),
    SUMMER("summer", "hot"),
    AUTUMN("autumn", "cool"),
    WINTER("winter", "cold");
    private String name;
    private String desc;
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }
    private Season(){}

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
