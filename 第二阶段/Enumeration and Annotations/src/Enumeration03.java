public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.WINTER);

    }
}


// 用enum关键字实现枚举
enum Season02 {

//    public static final Season02 SPRING = new Season02("春天", "温暖");
//    public static final Season02 SUMMER = new Season02("夏天", "炎热");
//    public static final Season02 AUTUMN = new Season02("球天", "凉爽");
//    public static final Season02 WINTER = new Season02("冬天", "寒冷");

    //如果使用了enum来实现枚举类
    //1. 使用关键字enum 代替 class
    //2. public static final Season02 SPRING = new Season02("春天", "温暖");
    //   变成(等价于) SPRING("春天", "温暖") -解读> 常量名(参数列表)
    //3. 如果有多个常量对象,用逗号分隔,且写成一行
    //4. 如果用enum来实现枚举,要求定义的常量对象写在最前面
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("球天", "凉爽"),
    WINTER("冬天", "寒冷");

    private String name;
    private String desc;


    private Season02(String name, String  desc){
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
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

//    static{
//        System.out.println("如果我出现,说明没有优化,不等价");
//    }

}