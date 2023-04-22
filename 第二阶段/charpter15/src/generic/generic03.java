package generic;

public class generic03 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("hsp");
        stringPerson.showClass();
        /**
         * class Person<String>{
         *     String s;
         *     String a;
         *     Person(String a){
         *
         *     }
         *     public String f(){
         *         return a;
         *     }
         * }
         */

        Person<Integer> integerPerson = new Person<>(100);
        integerPerson.showClass();
        /**
         * class Person<Integer>{
         *     String s;
         *     Integer a;// 该数据类型,在定义Person对象的时候指定(在编译期间就确定E是什么类型)
         *     Person(Integer a){
         *
         *     }
         *     public Integer f(){
         *         return a;
         *     }
         * }
         */
    }
}

//泛型的作用:可以在类在声明时通过一个标识标识类中某个属性的类型;或者时某个方法的返回值.或者是参数类型
class Person<E>{
    String s;
    E a;// 该数据类型,在定义Person对象的时候指定(在编译期间就确定E是什么类型)
    Person(E a){
        this.a = a;
    }
    public E f(){
        return a;
    }
    public void showClass(){
        System.out.println(a.getClass());
    }
}
