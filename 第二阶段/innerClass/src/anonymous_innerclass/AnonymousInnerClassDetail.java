package anonymous_innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.method();

        System.out.println("outer05 hashcode=" + outer05);
    }
}

class Outer05 {
    private int n1 = 1;
    public void method(){

        //基于一个类的匿名内部类
        Person person = new Person(){
            private int n1 = 190;
            @Override
            public void hi(){
                System.out.println("匿名内部类重写了 hi方法");
                System.out.println("内部类的n1=" + n1 + "外部类的n1=" + Outer05.this.n1);

                System.out.println("匿名内部类的hashcode=" + Outer05.this);

            }
        };

        person.hi();//动态绑定，运行类型是Outer05$1


        //也可以直接调用，匿名内部类本身也是返回对象
//        new Person(){
//            @Override
//            public void hi(){
//                System.out.println("匿名内部类重写了 hi方法");
//            }
//
//            @Override
//            public void ok(String s) {
//                super.ok(s);
//            }
//        }.ok("jack");
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String s){
        System.out.println("Person ok()" + s);
    }
}