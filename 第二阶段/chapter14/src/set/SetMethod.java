package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // 以Set接口的其中一个实现类HashSet 来讲解Set接口的方法（向上转型 + 动态绑定）
        //2. 接口的实现类的对象（Set接口对象），不能存放重复元素，可以添加一个null
        //3. 存放的数据是无序的（添加的顺序和取出的顺序（固定的； 以后将源码会分析为什么取出的顺序是固定的）不一致）
        //4. 可以使用迭代器或者增强for（增强for的底层就是迭代器）， 因为它是Collection的子接口. 不能通过索引获取元素
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
//        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("===增强for===");
        for(Object o : set){
            System.out.println(o);
        }

        //remove
        //contains
    }
}
