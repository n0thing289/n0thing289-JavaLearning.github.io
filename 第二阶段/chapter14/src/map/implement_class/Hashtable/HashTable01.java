package map.implement_class.Hashtable;

import java.util.Hashtable;

@SuppressWarnings({"all"})
public class HashTable01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john", 100);
//        hashtable.put(null, 100);
//        hashtable.put("john",null);
        hashtable.put("lucy", 100);
        hashtable.put("lic",100);
        hashtable.put("lic", 80);
        System.out.println(hashtable);
        hashtable.put("hello1", 1);
        hashtable.put("hello2", 1);
        hashtable.put("hello3", 1);
        hashtable.put("hello4", 1);//从这里开始是分析扩容的底层是怎么样的
        hashtable.put("hello5", 1);//8
        hashtable.put("hello6", 1);
        hashtable.put("hello7", 1);
        hashtable.put("hello8", 1);
        hashtable.put("hello9", 1);

        System.out.println(hashtable);

        /**
         * 1. 底层数组是 Hashtable$Entry 初始化为11
         * 2. threshold 8 = 11*0.75
         *
         *      //put()
         *      public synchronized V put(K key, V value) {
         *         // Make sure the value is not null
         *         if (value == null) {// 这里就是不能为空的原因
         *             throw new NullPointerException();
         *         }
         *
         *         // Makes sure the key is not already in the hashtable.
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> entry = (Entry<K,V>)tab[index];
         *         for(; entry != null ; entry = entry.next) {//如果对应index的位置上不为空,就进入到这里
         *             if ((entry.hash == hash) && entry.key.equals(key)) {//这里判断是否是重复key(两个角度衡量),如果重复,那么这里是做新值替换旧值操作
         *                 V old = entry.value;
         *                 entry.value = value;
         *                 return old;
         *             }
         *         }
         *         //如果index对应的位置为空就直接调用addEntry(),把新元素添加在对应的位置
         *         addEntry(hash, key, value, index);
         *         return null;
         *     }
         *
         *     //addEntry()
         *     private void addEntry(int hash, K key, V value, int index) {
         *         modCount++;
         *
         *         Entry<?,?> tab[] = table;
         *         if (count >= threshold) {//如果count(修改次数,包括替换旧值也算)到达阈值就会进入rehash()扩容
         *             // Rehash the table if the threshold is exceeded
         *             rehash();
         *
         *             tab = table;
         *             hash = key.hashCode();
         *             index = (hash & 0x7FFFFFFF) % tab.length;
         *         }
         *
         *         // Creates the new entry.
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>) tab[index];
         *         tab[index] = new Entry<>(hash, key, value, e);//直接添加
         *         count++;
         *     }
         *
         * 3. 扩容:
         *     执行 方法 addEntry(hash, key, value,index);添加k-v封装到Entry
         *
         *      addEntry(){//添加k-v到Entry数组
         *      if (count >= threshold) {
         *             // Rehash the table if the threshold is exceeded
         *             rehash();
         *      }
         *
         *
         *      protected void rehash() {//扩容的核心方法
         *         int oldCapacity = table.length;
         *         Entry<?,?>[] oldMap = table;
         *
         *         // overflow-conscious code
         *         int newCapacity = (oldCapacity << 1) + 1;// 左移一位就是乘以2的意思
         *         if (newCapacity - MAX_ARRAY_SIZE > 0) {
         *             if (oldCapacity == MAX_ARRAY_SIZE)
         *                 // Keep running with MAX_ARRAY_SIZE buckets
         *                 return;
         *             newCapacity = MAX_ARRAY_SIZE;
         *         }
         *         Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];
         *
         *         modCount++;
         *         threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
         *         table = newMap;
         *
         *         for (int i = oldCapacity ; i-- > 0 ;) {//这一部分的for循环是用来把旧值添加到扩容后的新Entry数组
         *             for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
         *                 Entry<K,V> e = old;
         *                 old = old.next;
         *
         *                 int index = (e.hash & 0x7FFFFFFF) % newCapacity;
         *                 e.next = (Entry<K,V>)newMap[index];
         *                 newMap[index] = e;
         *             }
         *         }
         *     }
         */
    }
}
