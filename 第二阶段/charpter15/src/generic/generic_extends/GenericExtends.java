package generic.generic_extends;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的继承和通配符
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");

        //1.泛型没有继承性
//        ArrayList<Object> arrayList = new ArrayList<String>();

        //2.
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

//        printCollection1(list1);
//        printCollection1(list2);
//        printCollection1(list3);
//        printCollection1(list4);
//        printCollection1(list5);

        /** ? extends AA 支持AA类以及AA类的子类(规定泛型的上线) */
//        printCollection2(list1);
//        printCollection2(list2);
//        printCollection2(list3);
//        printCollection2(list4);
//        printCollection2(list5);

        /** ? super AA 支持AA类以及AA类的父类,不限于直接父类(规定泛型的下限) */
//        printCollection3(list1);
//        printCollection3(list2);
//        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);


    }
    public static void printCollection1(List<?> c){
        for(Object object:c){
            System.out.println(object);
        }
    }
    /** ? extends AA 支持AA类以及AA类的子类(规定泛型的上线) */
    public static void printCollection2(List<? extends AA> c){
        for(Object object:c){
            System.out.println(object);
        }
    }
    /** ? super AA 支持AA类以及AA类的父类,不限于直接父类(规定泛型的下限) */
    public static void printCollection3(List<? super AA> c){
        for(Object object:c){
            System.out.println(object);
        }
    }

}

class AA{

}
class BB extends AA{

}
class CC extends BB{

}