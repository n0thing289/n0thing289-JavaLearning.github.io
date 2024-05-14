package override_;

public class Dog extends Animal {

    public void cry() {
        //1. 继承于Animal
        //2. Dog的cry和Anima的cry方法的定义形式（名称，返回类型，参数）
        System.out.println("小狗哇哇叫");

    }

    //细节：返回类型一致或者 子类返回类型是父类返回类型的子类
    public String m1(){
        return null;
    }
}
