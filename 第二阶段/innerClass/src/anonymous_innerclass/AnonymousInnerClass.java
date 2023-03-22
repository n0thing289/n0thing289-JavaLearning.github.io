package innerclass.anonymous_innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
//jdk底层系统会分配的名字，不能直接看到
class Outer04{
    private int n1 = 10;

    public void method(){
        //traditional means
//        IA tiger = new tiger();
//        tiger.cry();

        //老韩解读
        //1. 需求:想用IA接口,并创建对象
        //2. 传统方式,是写一个类,来实现接口,再创建对象
        //3. 但是老韩只想使用一次tiger类,以后都不再用了
        //4. 引出匿名内部类
        //5. tiger的编译类型 ？IA
        //6. tiger的运行类型 ？就是匿名内部类 Outer04$1
        //7. jdk底层在创建匿名内部类 Outer04$1,立即马上就创建了Outer04$1实例，并把对象的地址返回给tiger
        //8. 匿名内部类使用一次，就不能再使用（对象可以多次调用）

        /**
         * 底层
         * class xxx implement IA{
         *     public void cry(){
         *         System.out.println("tiger crying~");
         *     }
         * }
         */
        IA tiger = new IA() {// 这句话本质是定义了一个类，然后这个类实现了IA这个接口，将这个类创建实例，地址返回给tiger（编译类型是IA接口类型）
            @Override
            public void cry() {
                System.out.println("tiger crying~");
            }
        };

        tiger.cry();
        tiger.cry();
        tiger.cry();
        System.out.println("tiger对象的运行类型" + tiger.getClass());//获取运行类型 class innerclass.anonymous_innerclass.Outer04$1

        //演示基于类的匿名内部类
        //1. father编译类型 Father
        //2. father运行类型 Outer04$2
        //3. 底层会创建匿名内部类
        /**底层
         * class Outer04$2 extends Father{
         *     @Override
         *     public void test() {
         *         System.out.println("匿名内部类重写了test方法");
         *     }
         * }
         */
        //4. 同时也直接返回了 匿名内部类
        //5. 注意参数列表 会传递给构造器
        Father father = new Father("jack"){//如果没有大括号，其实就是创建对象运行类型是Father，不是匿名内部类

            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型" + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            public void eat() {
                System.out.println("匿名内部类重写eat（）方法");
            }
        };
        animal.eat();
    }
}

interface IA{
    public void cry();
}
//traditional
class tiger implements IA{
    @Override
    public void cry() {
        System.out.println("tiger crying~");
    }
}
class dog implements IA{
    @Override
    public void cry() {
        System.out.println("dog crying~");
    }
}

class Father{

    public Father(String name){
        System.out.println(name);
    }
    public void test(){

    }
}

abstract class Animal{
    public abstract void eat();
}