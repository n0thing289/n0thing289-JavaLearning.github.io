package review.two;

public class AbstractDetail02 {
}

//5
abstract class AA{
    public void f1(){}
    public AA(){}

    private static int n1 = 10;
    //6
//    public abstract void f2(){
//
//    }
    public abstract void sayOk();
}
//7
class BB extends AA{
    public void sayOk(){

    }
}
//8
abstract class C{
    public abstract void f1();
}


