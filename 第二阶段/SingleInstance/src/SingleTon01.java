public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend girlFriend = new GirlFriend("小红");
//        GirlFriend girlFriend2 = new GirlFriend("小白");
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);
    }
}

//有一个类, 叫girlFriend

//只能有一个女朋友

class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("xiaohonghong");
    // 如何保证只能创建一个女朋友
    //步骤【单利模式-饿汉式】
    // 1, 将构造器私有化，防止直接new
    // 2. 在类内部创建对象（该对象是static）
    // 3. 向外暴露一个公共的静态方法，返回gf对象

    // 为什么叫恶汉式？ 因为还没创建对象，就给你返回了对象，很着急嘛
    //弊端: 因为不管怎么样至少有一个对象被创建,又因为单例中的对象是重量级对象, 这样会造成资源浪费
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance(){// 就是要不创建对象的时候就能用
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
