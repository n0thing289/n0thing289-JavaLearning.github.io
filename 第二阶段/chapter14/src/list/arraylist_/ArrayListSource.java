package list.arraylist_;

import java.util.ArrayList;

public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //用无参构造器创建ArrayList对象
//        ArrayList list = new ArrayList();
        ArrayList list = new ArrayList();
        //使用for给list集合添加0-10
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        //使用for给list集合添加11-15
        for(int i=11;i<=15;i++){
            list.add(i);
        }

        list.add(100);//这里可以看见null
        list.add(200);
        list.add(null);
        for(Object object : list){
            System.out.println(object);
        }
    }

    /**
     * 第一次调用add()
     *      //1
     *      public boolean add(E e) {
     *         ensureCapacityInternal(size + 1);  // Increments modCount!!
     *         elementData[size++] = e;// size原本是0， 将传入的元素加入到对应的位置，然后size自增
     *         return true;
     *     }
     *
     *     //2
     *     private void ensureCapacityInternal(int minCapacity) {
     *         ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
     *     }
     *
     *     //3  这个方法主要是针对第一次添加时，默认给10个容量
     *     private static int calculateCapacity(Object[] elementData, int minCapacity) {
     *         if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
     *             return Math.max(DEFAULT_CAPACITY, minCapacity);
     *         }
     *         return minCapacity;
     *     }
     *
     *     //4 这个方法主要是进行是否扩容的判断，如果算出来最小的所需容量比数组的长度大，就会调用grow（）进行扩容
     *     private void ensureExplicitCapacity(int minCapacity) {
     *         modCount++;
     *
     *         // overflow-conscious code
     *         if (minCapacity - elementData.length > 0)
     *             grow(minCapacity);
     *     }
     *
     *     //5 这个grow方法就是真正进行扩容的，
     *     private void grow(int minCapacity) {
     *         // overflow-conscious code
     *         int oldCapacity = elementData.length;
     *         int newCapacity = oldCapacity + (oldCapacity >> 1);// 这里意思就是扩容1.5倍
     *         if (newCapacity - minCapacity < 0)// 这里只有第一次添加才会进来，以后是不会再进来的
     *             newCapacity = minCapacity;
     *         if (newCapacity - MAX_ARRAY_SIZE > 0)// 这里是判断所需的新容量有没有大于一个值（很大），如果还不够就调用更大的数来扩容
     *             newCapacity = hugeCapacity(minCapacity);
     *         // minCapacity is usually close to size, so this is a win:
     *         elementData = Arrays.copyOf(elementData, newCapacity);// 这行是，先创建一个空数组，长度为所需的新的容量，将原本的elementDate数组复制给新数组，如果复制完成还有位置，那么其余位置是空（数组创建机制）
     *                                                               //然后再修改旧数组变量的引用，让其指向新数组，旧数组会被gc回收销毁
     *     }
     *
     */
}
