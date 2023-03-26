package review;

public class CustomEnum {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
//class Season{
//    private String name;
//    private String desc;
//
//    public static final Season SPRING = new Season("spring", "warm");
//    public static final Season SUMMER = new Season("summer", "hot");
//    public static final Season AUTUMN = new Season("autumn", "cool");
//    public static final Season WINTER = new Season("winter", "cold");
//    private Season(String name, String desc){
//        this.name = name;
//        this.desc = desc;
//    }
//    private  Season(){}
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}
