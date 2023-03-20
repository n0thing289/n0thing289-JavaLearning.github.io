package review.review_interfaceDetail;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        new CC().sayOk();
    }
}

//5
class C implements IA, IB {

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }
}

//6
interface IC{
    int a = 1;
    public static final int a2 = 2;
    public void sayOk();
}
class CC implements IC{

    @Override
    public void sayOk() {
        System.out.println(IC.a2);
    }
}
//8
interface ID extends IA, IB {
    
}