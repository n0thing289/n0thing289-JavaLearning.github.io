package review;
public class SingleTon01{
    public static void main(String[] args){
        GirlFriend gf01 = GirlFriend.getInstance();
        GirlFriend gf02 = GirlFriend.getInstance();
        System.out.println(gf01);
        System.out.println(gf02);


        GirlFriend02 gf02_01 = GirlFriend02.getInstance("abc");
        GirlFriend02 gf02_02 = GirlFriend02.getInstance("zxc");
        System.out.println(gf02_01);
        System.out.println(gf02_02);
    }
}


// 单例设计模式， 饿汉式
// 1. 构造器初始并且私有化
// 2. 定义静态属性，存对象实例
// 3. 写一个公共的静态的方法

class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("Catty");
    private GirlFriend(String name){
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}


//懒汉式
// 1. 构造器初始并且私有化
// 2. 定义静态属性，存对象实例
// 3. 写一个公共的静态的方法（看情况调用构造器new对象）
class GirlFriend02{
    private String name;
    private static GirlFriend02 gf;
    private GirlFriend02(String name){
        this.name = name;
    }

    public static GirlFriend02 getInstance(String name){
        if(gf== null){
            gf = new GirlFriend02(name);
        }
        return gf;

    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}