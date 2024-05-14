package equals_;

public class Equals01 {
    public static void main(String[] args){
        A a = new A();
        A a2 = a;
        A a3 = a2;
        System.out.println(a3 == a2);//都指向一个数据空间，每个数据空间都有对应的地址，==判断地址，所以是true


        "123".equals("1234");
    }
}

class B {

}
class A{

}
