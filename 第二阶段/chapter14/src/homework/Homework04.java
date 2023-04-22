package homework;

import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        /**
         * hashCode() + equals()
         */

        TreeSet treeSet = new TreeSet();
        /**
         * 去重机制：compare（），就是你传入的比较器中要重写的方法；
         * 如果没有传入comparator，则会执行下面的转为Comparable接口类型（字符串实现了），
         * 如果自己写的没有传构造器，Comparable也没有实现，是加不进去会报错的
         */

    }
}
