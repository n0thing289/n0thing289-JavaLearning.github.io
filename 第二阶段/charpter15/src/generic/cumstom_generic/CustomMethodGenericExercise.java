package generic.cumstom_generic;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);
        apple.fly(new Dog());
    }
}
class Apple<T,R,M>{//自定义泛型类
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }
//    public void eat(U u){//不是自定义泛型方法,那么是想使用泛型类的泛型,但是泛型类并没有定义U
//
//    }
}
class Dog{

}