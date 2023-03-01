public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE = 1;
    }
}
//final class A{
//    // 1.不希望A被继承
//}
//class B extends A{
//
//}


//class C{
//    // 2.不希望子类重写我的方法
//    public final void hi(){
//
//    }
//}
//class D extends C{
//    public void hi(){
//        System.out.println("重写了C类的hi方法");
//    }
//}

class E {
    // 3.不希望属性被修改
    public final double TAX_RATE = 10;
}

class F{
    public void cry(){
        // 4. 不希望局部变量被修改
        final double NUM = 0.01;
//        NUM = 1;
    }
}