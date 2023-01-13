package polydetail;

public class polyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);//10,属性没有重写之说
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}

class Base{
    int count = 10;
}

class Sub extends Base{
    int count = 20;
}