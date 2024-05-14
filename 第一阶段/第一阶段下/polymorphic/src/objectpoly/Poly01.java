package objectpoly;

public class Poly01 {
    public static void main(String[] args) {
        Animal animal = new Dog();//父类对象的引用指向子类对象
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
