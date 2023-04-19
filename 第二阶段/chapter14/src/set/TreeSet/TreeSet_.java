package set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
        //老汉解读
        //1. 当我们使用无参构造器的时候, 仍然是无序
        //2. 当老师希望按照字母顺序来排序时
        //3. 使用TreeSet 提供的一个构造器,可以传入一个比较器(匿名内部类)
        //      并指定排序规则
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((String)o2).compareTo((String) o1);
                return ((String)o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);
        treeSet.add("abc");//当是第二个return时
        /**
         *  源码解析
         *  1. 构造器把传入的比较器对象,传给TreeMap的comparator属性
         *      public TreeMap(Comparator<? super K> comparator) {
         *         this.comparator = comparator;
         *     }
         *
         *  2.
         *      public V put(K key, V value) {
         *         Entry<K,V> t = root;
         *         if (t == null) {
         *             compare(key, key); // type (and possibly null) check
         *
         *             root = new Entry<>(key, value, null);
         *             size = 1;
         *             modCount++;
         *             return null;
         *         }
         *         int cmp;
         *         Entry<K,V> parent;
         *         // split comparator and comparable paths
         *         Comparator<? super K> cpr = comparator; // cpr就是指向了我们写的匿名内部类
         *         if (cpr != null) {
         *             do {
         *                 parent = t;
         *                 cmp = cpr.compare(key, t.key);// 这里就去调用匿名内部类的compare方法
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else  // 如果相等(cmp == 0),即返回0,这个新key就没有加入
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *         else {
         *             if (key == null)
         *                 throw new NullPointerException();
         *             @SuppressWarnings("unchecked")
         *                 Comparable<? super K> k = (Comparable<? super K>) key;
         *             do {
         *                 parent = t;
         *                 cmp = k.compareTo(t.key);
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *         Entry<K,V> e = new Entry<>(key, value, parent);
         *         if (cmp < 0)
         *             parent.left = e;
         *         else
         *             parent.right = e;
         *         fixAfterInsertion(e);
         *         size++;
         *         modCount++;
         *         return null;
         *     }
         */
    }
}
