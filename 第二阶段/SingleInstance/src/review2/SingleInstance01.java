package review2;

public class SingleInstance01 {
    public static void main(String[] args) {
        GirlFriend gf1 = GirlFriend.work();
        GirlFriend gf2 = GirlFriend.work();
        System.out.println(gf1);
        System.out.println(gf2);
    }
}
// 写一个饿汉式单例
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("小镁");

    private GirlFriend(String name){
        this.name = name;
    }

    public static GirlFriend work(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

