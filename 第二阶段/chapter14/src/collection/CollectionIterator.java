package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("xiaolifeidao", "Gu Long", 5.1));
        col.add(new Book("hong lou meng", "cao xue qing", 34.6));

        Iterator iterator = col.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println("book = " + o);
        }

        //快捷代码模板 itit
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("book = " + next);
        }
        //ctrl + j 所有快捷键模板

    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
