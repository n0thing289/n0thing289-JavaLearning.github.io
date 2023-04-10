package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("a", 1));
        list.add(new Dog("b", 2));
        list.add(new Dog("c", 3));

        //iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println("o = "  + o);
        }
        System.out.println("==============");
        for(Object i:list){
            System.out.println("o = "  + i);
        }
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name = " + name + "\t age = " + age;
    }
}