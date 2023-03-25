public class Homework03 {// 这里开始看视频
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        shout(cat);
        shout(dog);

    }

    public static void shout(Animal animal){
        animal.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}

class Cat extends Animal{
    @Override
    public void shout(){
        System.out.println("猫会猫猫叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("狗会汪汪叫");
    }
}
