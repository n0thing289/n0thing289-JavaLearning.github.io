package review;

public class FinalDetail {
    public static void main(String[] args) {
        System.out.println(A.n4);
    }
}

class A{
    public final int n1 = 10;
    final int n2;
    final int n3;
    {
         n2 = 100;
    }
    A(){
         n3 = 1000;
    }

    final static int n4 = 9;
    final static int n5;
    static {

        n5 = 10;
    }

    final void hi(){

    }

    static{
        System.out.println("oh");
    }
}
class B extends A{

}

