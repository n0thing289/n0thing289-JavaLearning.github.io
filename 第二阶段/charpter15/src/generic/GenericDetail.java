package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //1. 要求引用类型
        ArrayList<Integer> integers = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>();
        //2. 给定具体类型后,可以传入具体类型的子类型
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("string");

        //3. 泛型的使用形式
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer> integers2 = new ArrayList<>();//编译器会进行类型推断, 导致右边的可以省略

        //4. 如果这样写 泛型默认时Object
        ArrayList arrayList = new ArrayList();//ArrayList<Object> arrayList = new ArrayList<Object>();


    }
}
