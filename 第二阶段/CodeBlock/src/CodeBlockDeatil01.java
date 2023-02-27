public class CodeBlockDeatil01 {
    public static void main(String[] args) {
//         1. 创建对象实例时
        AA aa = new AA();
//        AA aa1 = new AA();// 注意！
        /*
            AA aa = new AA();
            AA aa1 = new AA();
            class BB{
                {
                    System.out.println("BB的静态方法被执行");
                }
            }
            class AA extends BB{
                static{
                    System.out.println("AA 的静态方法块执行...");
                }
            }
            1. 类的加载：三种情况下，类会先进行加载，父类先加载 -》 子类
            2. 类的加载比对象初始化要快，因此类的加载先加载完，然后从子类开始不断往上调用父类的构造器完成子类的初始化
            3. 类一加载就会调用静态代码块，而构造器初始化之前才会调用普通代码块
         */

        // 2. 创建子类对象时. 父类也会被加载,而且父类先被加载,子类后被加载
//        AA aa1 = new AA();

        // 3. 使用类的静态成员时
//        System.out.println(Cat.n1);

//        DD dd = new DD();
//        DD dd1 = new DD();
//        System.out.println(DD.n1);
    }
}
//class DD{
//    public static int n1 = 888;
//    static{
//        System.out.println("DD的静态方法块被执行");
//    }
//    {
//        System.out.println("DD的普通方法块被执行");
//
//    }
//}
//class Animal{
//    static{
//        System.out.println("Animal的静态方法被执行");
//    }
//}
//class Cat extends Animal{
//    public static int n1 = 99;
//    static{
//        System.out.println("Cat的静态方法被执行");
//    }
//}
class BB{
    static{
        System.out.println("BB的静态方法被执行");
    }
}
class AA extends BB{
    static{
        System.out.println("AA 的静态方法块执行...");
    }
}