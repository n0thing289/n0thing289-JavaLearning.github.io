package map.source;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("java", 10);
        map.put("php",10);
        map.put("java",20);
        System.out.println(map);

        //1. 执行构造器
        /**
         * 1. 执行构造器
         *      初始化加载因子loadFactor 0.75
         *
         * 2. 执行put
         *      public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *      }
         *
         *      2.1 先算出当前key对象的哈希值 hash(key)
         *      static final int hash(Object key) {
         *         int h;
         *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
         *      }
         *
         *      2.2 核心的算法
         *      final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i; //定义辅助变量
         *         //如果底层的table属性数组为null 或者length为0就第一次扩容到16
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         //取出对应哈希值的索引的node对象，如果为空，说明此索引没有对象，那么会直接把新创建的node对象往这里放
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash && //我先判断hash值是不是相同，
         *             又判断原本位置key(node对象)和现在传进来的key(node对象)是不是一样(判断地址),
         *             再判断两个key对象的value是不是一样
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {// 适用于hash一样,但是值不一样,会将新node挂载到后面
         *                 //挂载的时候会不断的又进行判断下一个next是不是空 或者 下一个next与我当前的node是不是重复
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         // 加入后,判断我走了(判断)几次, 如果判断了8次,说明这里的node对象有了8个,
         *                         //那么会调用 treeifyBin方法,进行红黑树的树化
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))// 和上面的判断重复对象的条件表达式一样
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             // 重复的key,就会把值替换
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;// 重复的key,就会把值替换
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount; //
         *         if (++size > threshold)// 每增加一个node对象, size就会先自增,再去判断大于阈值否?
         *         //如果超过阈值,就会再次调用resize() 进行扩容
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *      }
         *
         *      树化代码部分
         *      //如果table为null, 或者数组的长度没有到64(注意size是加一个node就算包括链表的node)
         *      //暂时先不树化,而是进行扩容
         *      //否则才进行树化
         *      //剪枝: 当你链表已经变成树了, 但是不断的减少,到一定程度后,就会把这颗树又装换成链表
         *      final void treeifyBin(Node<K,V>[] tab, int hash) {
         *         int n, index; Node<K,V> e;
         *         if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
         *             resize();
         */
    }
}
