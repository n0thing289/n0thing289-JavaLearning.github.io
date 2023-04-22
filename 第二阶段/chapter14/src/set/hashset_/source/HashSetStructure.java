package set.hashset_.source;

@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层就是HashMap, HashMap底层是数组链表红黑树

        //1. 创建一个数组
        //2. 有些人把Node[]数组成为表
        Node[] table = new Node[16];
        System.out.println(table);
        // 3. 创建节点
        Node john = new Node("john", null);
        table[2] = john;

        Node jack = new Node("jack", null);
        john.next = jack;// 将jack节点 挂载到john

        Node rose = new Node("Rose", null);
        jack.next = rose;// 将rose节点 挂载到jack上

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println(table);

    }


}

class Node{
    //结点,存储数据,可以指向下一个节点,以此形成链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

