package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("xiaolifeidao", "Gu Long", 5.1));
        col.add(new Book("hong lou meng", "cao xue qing", 34.6));

        //增强for循环用于遍历Collection集合
        // 其底层仍然是迭代器(debug就知道了)
        for(Object o :col){
            System.out.println("book = " + o);
        }

        //增强for循环用于数组
        int[] nums = {1, 2, 3, 4, 5, 67, 90};
        for(int i : nums){
            System.out.println("i = " + i);
        }
    }
}
