package list;

import java.util.*;

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("san guo yan yi", 20.1, "luo guan zhong"));
        list.add(new Book("hong lou meng",10.1,"cao xue qing"));
        list.add(new Book("shui hu zhuang", 30, "shi nai an"));
        list.add(new Book("xi you ji", 50.1 , "wu cheng en"));
        System.out.println(list);
        Book.bookSort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//自动装箱
                Double d1 = (Double) o1;
                Double d2 = (Double) o2;
                Double res = d1 - d2;
                if(res > 0){
                    return 1;
                } else if (res == 0) {
                    return 0;
                }else{
                    return -1;
                }
            }
        });

//        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString(){
        return
                "名称: " + name + "\t\t\t" +
                "价格: " + price + "\t\t\t" +
                "作者: " + author + "\n" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void bookSort(List list, Comparator c){
        Object temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0;j< list.size() - 1 -i;j++){
                //get element

                Object ele = list.get(j);
                Object ele2 = list.get(j + 1);
                if(!(ele instanceof Book && ele2 instanceof Book)){
                    continue;
                }
                double elePrice = ((Book)ele).getPrice();
                double ele2Price = ((Book)ele2).getPrice();

                if(c.compare(elePrice, ele2Price) > 0){

                   list.set(j + 1, ele);
                   list.set(j, ele2);
                }
            }
        }
    }
}
/**
 * 设计比较重要的知识点:
 * 1. 匿名内部类
 * 2. 动态绑定
 * 3. 接口编程 + 定制排序
 * 4. 自动装箱拆箱
 * 5. 向上转型和向下转型
 * 6. 父类的引用指向子类对象
 * 7. 集合的元素交换
 */