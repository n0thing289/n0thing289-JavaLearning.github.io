package list.linkedlist_;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        //建立连接
        Node first = jack;
        jack.next = tom;
        tom.next = hsp;

        Node last = hsp;
        hsp.pre = tom;
        tom.pre = jack;

//        System.out.println("从头开始遍历");
//        while(first != null){
//            System.out.println(first);
//            first = first.next;
//        }

//        while(last != null){
//            System.out.println(last);
//            last = last.pre;
//        }

        //添加一个smith节点
        Node smith = new Node("smith");
        smith.next = hsp;
        smith.pre = tom;

        tom.next = smith;
        hsp.pre = smith;
        while(last != null){
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}