package generic;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        arrayList.add(new Dog());

        //如果不小心加了一个猫
        arrayList.add(new Cat());

        for(Object o : arrayList){
            Dog dog = (Dog) o;
            System.out.println(dog);
        }
    }
}
class Dog{

}
class Cat{}
