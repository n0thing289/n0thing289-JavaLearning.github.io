public class Abstract01 {
    public static void main(String[] args) {
        new Dog().eat();
    }
}


abstract class Animal{
    String name;
    int age;
    public abstract void eat();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("好吃 汪汪汪");
    }
}
