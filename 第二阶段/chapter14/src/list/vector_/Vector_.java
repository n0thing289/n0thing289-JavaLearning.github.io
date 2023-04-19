package list.vector_;

import java.util.Vector;

public class Vector_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Vector vector = new Vector();
        for(int i=0;i<10;i++){
            vector.add(i);
        }
        vector.add(1);

        /**
         *      //1. new Vector() 底层默认给10
         *          public Vector() {
         *              this(10);
         *          }
         *          public Vector(int initialCapacity) {
         *              this(initialCapacity, 0);
         *          }
         *          public Vector(int initialCapacity, int capacityIncrement) {
         *              super();
         *              if (initialCapacity < 0)
         *                  throw new IllegalArgumentException("Illegal Capacity: "+
         *                                                initialCapacity);
         *              this.elementData = new Object[initialCapacity];// 直接这里就给你默认给10个大小了
         *              this.capacityIncrement = capacityIncrement;
         *          }
         *
         *      //
         *      public synchronized boolean add(E e) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = e;
         *         return true;
         *     }
         *
         *     //
         *     private void ensureCapacityHelper(int minCapacity) {
         *         // overflow-conscious code
         *         if (minCapacity - elementData.length > 0)
         *             grow(minCapacity);
         *     }
         *
         *     //
         *     private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
         *                                          capacityIncrement : oldCapacity);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         *
         */
        //
        //2. vector.add() 和arraylist的很像
        //2.1 public synchronized boolean add(E e) {
        //        modCount++;
        //        ensureCapacityHelper(elementCount + 1);
        //        elementData[elementCount++] = e;
        //        return true;
        //    }
        //2.2 private void ensureCapacityHelper(int minCapacity) {
        //        // overflow-conscious code
        //        if (minCapacity - elementData.length > 0)
        //            grow(minCapacity);
        //    }
        // 如果需要的数组大小不够用,就扩容,
        //2.3 private void grow(int minCapacity) {
        //        // overflow-conscious code
        //        int oldCapacity = elementData.length;
        //        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
        //                                         capacityIncrement : oldCapacity);等价于扩大两倍的值是新数组的长度
        //        if (newCapacity - minCapacity < 0)
        //            newCapacity = minCapacity;
        //        if (newCapacity - MAX_ARRAY_SIZE > 0)
        //            newCapacity = hugeCapacity(minCapacity);
        //        elementData = Arrays.copyOf(elementData, newCapacity);
        //    }
    }
}
