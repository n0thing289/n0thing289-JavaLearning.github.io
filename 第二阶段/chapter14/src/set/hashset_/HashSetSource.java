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
        //        else {// 添加重复的java的时候会进来这里
        //            Node<K,V> e; K k;  // 在需要局部变量的时候再创建
        //            if (p.hash == hash && //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样 p是当前索引对应的对象 和准备添加的key的hash值做比较
        //                                  //并且满足  (1)准备加入的key 和 p指向的Node节点的key是同一个对象
                                            //         (2)p指向的Node节点的key的equals方法 和 准备加入的key比较后相同
        //                ((k = p.key) == key || (key != null && key.equals(k))))//这个equals是对非字符串对象做内容相同标准的(程序员自己控制)
        //                e = p;
                        // 也就是说.第一个if是待加入的元素 先和数组的一个元素比较
                        //再判断 p 是不是一个红黑树
                        //如果是一颗红黑树, 就调用putTreeVal()
        //            else if (p instanceof TreeNode)
        //                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);

        //            else {//这个就是链表部分的添加,(假设table表,第3个jack 挂载了两个mary-smith,此时有一个tom要加入进来;tom先跟mary比在跟Smith比;一旦有重复就退出放弃加入这个tom, 然后循环比较后,确定没有重复就加入到smith后面)
        //                 //(1) 依次和改链表的每一个元素比较后, 都不相同(说明没有重复,就会挂到改链表的屁股后面)
                                  //注意把元素添加到链表后， 立即判断，该链表是否已经达到8个结点
                                  //，就调用 treeifyBin() 对当前这个链表进行树化(转成红黑树)
                                  //注意,再转成红黑树时,要进行判断,判断条件
                            //        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                            //            resize();
                                  //如果上面条件成立， 先table扩容
//                                //只有上面条件不成立,才进行转成红黑树
                           //(2) 依次和该链表的每一个元素比较过程中,如果有相同情况,就直接break
        //                 //
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
