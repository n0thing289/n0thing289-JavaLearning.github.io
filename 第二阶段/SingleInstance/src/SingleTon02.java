public class SingleTon02 {
    public static void main(String[] args) {
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);
    }
}

// 假定这个人一生只能养一只猫
class Cat{
    private String name;
    static int n1 = 999;
    private static Cat cat;
    // 1. 构造器私有化
    // 2. 构造器声明static的car对象
    // 3. 提供一侧公共的静态方法，根据情况返回对象

    // 懒汉式：
    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("cute");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
