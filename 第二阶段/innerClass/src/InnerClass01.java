public class InnerClass01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private int n1 = 100;

    public void m1(){
        System.out.println("m1()");
    }
    {
        System.out.println("daimakuai");
    }
    public Outer(){
        System.out.println("Outer构造器()");
    }
}