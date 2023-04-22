package generic;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();//1.ArrayList<Dog>表示存放到ArrayList集合中的元素是Dog类型(也可以子类型)
        arrayList.add(new Dog());
        arrayList.add(new Dog());
        arrayList.add(new Dog());

        //如果不小心加了一个猫
//        arrayList.add(new Cat()); //2. 泛型对数据类型进行约束,添加进去的元素类型只能是Dog类型

        for(Dog o : arrayList){//3.在遍历的时候可以直接取出Dog类型而不是Object(没用泛型,不能直接这样写)
//            Dog dog = (Dog) o;
            System.out.println(o);
        }

        //4. public class ArrayList<E>{};创建的时候相当于把<Dog>(指定要传给泛型的类型)传给了E(泛型)
    }
}
