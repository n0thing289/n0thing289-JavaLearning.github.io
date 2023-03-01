public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BB.n1);
    }
}

final class AA{
    public final int get(){
        return 0;
    }// 1. 类已经不能被继承了，所以是多此一举，
    // 因为我们给方法用final就是不想被重写，既然不能继承何来重写之说呢

//    final AA(){  // 2. Modifier 'final' not allowed here
//
//    }
}

class BB{
    public final static int n1 = 1000;
    static{
        System.out.println("BB的静态代码块被调用, 说明类加载了");
    }
}