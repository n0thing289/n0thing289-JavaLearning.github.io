package menber_innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t();

        //第一种方式,从外部其他类访问成员内部类
        Outer08 outer08_1 = new Outer08();
        Outer08.Inner08 inner08 = outer08_1.new Inner08();
        inner08.say();
        //第二种方式，
        Outer08.Inner08 innerClassInstance = outer08_1.getInnerClassInstance();
        innerClassInstance.say();
        //第三种方式
        Outer08.Inner08 inner08_2 = new Outer08().new Inner08();

    }
}
class Outer08{
    private int n1 = 10;
    public String name = "zhangsan";
    public class Inner08{
        private int n2 = 20;
        public void say(){
            System.out.println("n1 = " + n1 + ", name = " + name);
        }
    }

    public void t(){
        Inner08 inner08 = new Inner08();
        inner08.say();

        System.out.println(inner08.n2);
    }

    public Inner08 getInnerClassInstance(){
        return new Inner08();
    }
}