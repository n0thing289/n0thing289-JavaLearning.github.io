package homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car bmw = new Car("bmw", 100000);
        Car benz = new Car("benz", 2000000);
        Car wulinghongguang = new Car("五菱宏光", 100000000);
        Car lanbojini = new Car("兰博基尼", 10000);
        Car baobaobashi = new Car("宝宝巴士", 10000000);
        arrayList.add(bmw);
        arrayList.add(benz);

        //add
        arrayList.add(wulinghongguang);
        arrayList.add(lanbojini);
        arrayList.add(baobaobashi);

        //remove
        Object remove = arrayList.remove(3);
        System.out.println(arrayList);

        //contains
        boolean flag_contains_lanbojini = arrayList.contains(lanbojini);
        boolean flag_contains_baobaobashi = arrayList.contains(baobaobashi);
        System.out.println("contains: " + flag_contains_lanbojini + "  " + flag_contains_baobaobashi);

        //size
        int size = arrayList.size();
        System.out.println("arraylist的大小 = " + size);

        //isEmpty
        boolean flag_isEmpty = arrayList.isEmpty();
        System.out.println("isEmpty = " + flag_isEmpty);

        //clear
        /**
         * 集合的复制
         * Arrays.copyOf()
         */
        ArrayList dest = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            dest.add(i);
        }
        Collections.copy(dest, arrayList);
        System.out.println(dest);
//        dest.clear();
        System.out.println(dest);

        //addAll
        arrayList.addAll(dest);
        System.out.println(arrayList);

        //containsAll
        boolean b = arrayList.containsAll(dest);
        System.out.println(b);

        //removeAll
        System.out.println(arrayList);
        arrayList.removeAll(dest);
        System.out.println(arrayList);
    }
}

class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}