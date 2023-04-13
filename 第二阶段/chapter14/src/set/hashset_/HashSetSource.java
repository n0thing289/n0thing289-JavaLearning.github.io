package set.hashset_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");// 第一次add分析
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set = " + hashSet);

        // 1.
        /*
            public HashSet() {
                map = new HashMap<>();
            }
         */

        // 2. 执行add()
        //public boolean add(E e) {
        //    return map.put(e, PRESENT)==null; //private static final Object PRESENT = new Object();
        //                                        PRESENT(HashSet的静态对象, 占位用的没多大意义,不管调用多少此put,这个都不变)
        //}
        //
        // 3. 执行put() ,会执行hash(key) 得到key对应的hash值 算法 (h = key.hashCode()) ^ (h >>> 16)
        //public V put(K key, V value) {
        //    return putVal(hash(key), key, value, false, true);
        //}
        //
        //4.
        // final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
        //                   boolean evict) {
        //        Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义了辅助变量
                    // table 就是HashMap的一个数组,类型就是Node[]
        //        if ((tab = table) == null || (n = tab.length) == 0)// 如果当前中国table是空的,或者大小等于0那么就第一次扩容
        //            n = (tab = resize()).length;//这步之后table就扩到16个长度了
        //          //(1)根据k算出来的哈希值取计算该k应该存放到table的哪个索引位置,
        //          //并且把这个位置的对象,赋给辅助变量p
        //          //(2)判断p是否为null
        //          //(2.1) 如果p为空,表示还没有存放元素,那就创建一个Node对象(k = "java", value = PRESENT)
        //          //(2.2) 就放在该位置tab[i] = newNode(hash, key, value, null);
        //        if ((p = tab[i = (n - 1) & hash]) == null)
        //            tab[i] = newNode(hash, key, value, null);
        //        else {
        //            Node<K,V> e; K k;
        //            if (p.hash == hash &&
        //                ((k = p.key) == key || (key != null && key.equals(k))))
        //                e = p;
        //            else if (p instanceof TreeNode)
        //                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        //            else {
        //                for (int binCount = 0; ; ++binCount) {
        //                    if ((e = p.next) == null) {
        //                        p.next = newNode(hash, key, value, null);
        //                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
        //                            treeifyBin(tab, hash);
        //                        break;
        //                    }
        //                    if (e.hash == hash &&
        //                        ((k = e.key) == key || (key != null && key.equals(k))))
        //                        break;
        //                    p = e;
        //                }
        //            }
        //            if (e != null) { // existing mapping for key
        //                V oldValue = e.value;
        //                if (!onlyIfAbsent || oldValue == null)
        //                    e.value = value;
        //                afterNodeAccess(e);
        //                return oldValue;
        //            }
        //        }
        //        ++modCount;
        //        if (++size > threshold)
        //            resize();
        //        afterNodeInsertion(evict);//留给子类去实现的
        //        return null;//代表成功
        //    }
    }
}
