package polydetail;

public class Cat extends Animal{
    //如果我就这里改成run2 父类不动，在polyDetail.java中还是run方法时
    //其方法查找机制是,还是从子类里找run方法,但是找不到因为子类没有重写run,在编译时就已经丢失,
    // 但是没完,子类没有我还会向上查找直到object类
    String name;
    public void run(){//不算子类特有的方法，因为它重写了父类的方法，运行时还是从子类开始 看有没有这个方法没有就继续向上找

        System.out.println("Cat 猫在跑");
    }

    public void catchMouse(){//这个是子类特有的方法，向上转型编译过程中会被丢失
        System.out.println("抓老鼠");
    }
}
