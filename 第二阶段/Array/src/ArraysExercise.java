import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {

    public static void f1(Book[] books) {// 从大到小排序
        Book.bookSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
//                return (int)(b2.getPrice() - b1.getPrice());//TODO 强转在老师给的数据里可以正常运行,但是其他数据就会报错
                double priceVal = b2.getPrice() - b1.getPrice();
                if (priceVal > 0) {
                    return 1;
                } else if (priceVal == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    public static void f2(Book[] books) {// 从小到大排序
        Book.bookSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
//                return (int)(b2.getPrice() - b1.getPrice());//TODO 强转在老师给的数据里可以正常运行,但是其他数据就会报错
                double priceVal = b2.getPrice() - b1.getPrice();
                if (priceVal > 0) {
                    return -1;
                } else if (priceVal == 0) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }


    public static void f3(Book[] books) {
        Book.bookSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                int l1 = b1.getName().length();
                int l2 = b2.getName().length();
                return l1 - l2;
            }
        });
    }

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦~", 100);
        books[1] = new Book("金瓶梅~", 90);
        books[2] = new Book("青年文摘~", 5);
        books[3] = new Book("java从入门到放弃~", 300);

        System.out.println("未排序前: " + Arrays.toString(books));
        f3(books);
        System.out.println("排序后: " + Arrays.toString(books));

        //定制排序 =  接口编程 + 匿名内部类 + 动态绑定
    }
}

class Book {
    private String name;
    private double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void bookSort(Book[] books, Comparator c) {
        Book temp;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (c.compare(books[j], books[j + 1]) > 0) {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "name:" + name + " price:" + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
