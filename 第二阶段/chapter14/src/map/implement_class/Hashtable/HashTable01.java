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
        hashtable.put("hello1", 1);
        hashtable.put("hello2", 1);
        hashtable.put("hello3", 1);
        hashtable.put("hello4", 1);
        hashtable.put("hello5", 1);
        hashtable.put("hello6", 1);
        hashtable.put("hello7", 1);
        hashtable.put("hello8", 1);
        hashtable.put("hello9", 1);

        System.out.println(hashtable);

        /**
         * 1. 底层数组是 Hashtable$Entry 初始化为11
         * 2. threshold 8 = 11*0.75
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
         *         for (int i = oldCapacity ; i-- > 0 ;) {
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
