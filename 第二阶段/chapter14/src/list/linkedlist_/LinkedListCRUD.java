package list.linkedlist_;

import java.util.LinkedList;

public class LinkedListCRUD {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //增 add() | add(int index , Object element)
        linkedList.add(3, "我是第三个元素");
        System.out.println(linkedList);
        //1. 构造器, 构造器没内容, 初始化属性这些
        //2. add(), 里面有linkLast(将新节点加入到屁股后面)

        //删 remove()
        linkedList.remove();
        System.out.println(linkedList);


        linkedList.set(1,999);
        System.out.println(linkedList);

        Object o = linkedList.get(1);
        System.out.println(o);

        //遍历方式



//        for(int i=1;i<=2;i++){
//            linkedList.add(i);
//        }
//
//        linkedList.add(100);
//        linkedList.add(100);
//        for(Object object : linkedList){
//            System.out.println(object);
//        }
////        linkedList.remove(0);
////        linkedList.remove(kk);
//
//        linkedList.set(0, "韩顺平教育");
//        System.out.println("===");
//        for(Object object : linkedList){
//            System.out.println(object);
//        }
//
//        Object object = linkedList.get(0);
//        System.out.println("object = " + object);
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());
    }
}
/**
 *      //
 *      public boolean add(E e) {
 *         linkLast(e);
 *         return true;
 *     }
 *      //
 *      void linkLast(E e) {
 *         final Node<E> l = last;
 *         final Node<E> newNode = new Node<>(l, e, null);
 *         last = newNode;
 *         if (l == null)
 *             first = newNode;
 *         else
 *             l.next = newNode;
 *         size++;
 *         modCount++;
 *     }
 *
 *
 */
