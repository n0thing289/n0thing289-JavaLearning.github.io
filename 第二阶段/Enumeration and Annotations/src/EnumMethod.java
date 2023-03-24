public class EnumMethod {
    public static void main(String[] args) {
        Season02 autumn = Season02.AUTUMN;

        //输出枚举常量的名字
        System.out.println(autumn.name());

        //return the ordinal of this enumeration constant
        //在Season02中的常量对象
        System.out.println(autumn.ordinal());

        //return a array of all enumeration constants
        //反编译的时候看到了values（）
//        System.out.println(autumn.values());
        Season02[] values = autumn.values();
        for(Season02 season:values){//增强for循环，和python的一种for遍历一样
            System.out.println(season);
        }

        //valueOf
        // 根据你输入的字符串，到枚举对象中查找
        // 找到了就返回，没有找到就报错
        Season02 autumn1 = Season02.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);

        //compareTo
        //返回Season02.AUTUMN的编号[2] - Season02.SUMMER的编号[3]
        System.out.println(Season02.AUTUMN.compareTo(Season02.SUMMER));
    }
}
