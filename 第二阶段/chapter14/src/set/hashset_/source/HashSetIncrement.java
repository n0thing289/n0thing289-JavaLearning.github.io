package set.hashset_.source;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for (int i = 0; i <= 100; i++) {
//            hashSet.add(i);
//        }

        //演示转成红黑树机制
        //让元素都挂载在一条链表上, 但是链表的第一个也就是node数组的序号 是hash决定的, 那么你就要hash一样,内容不一样的元素添加
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(new A(i));
//        }


        /**
         *
         */
        for (int i = 1; i < 7; i++) {
            hashSet.add(new A(i));
        }

        for (int i = 1; i < 7; i++) {
            hashSet.add(new B(i));
        }

    }
}


class A{
    private int n;
    public A(int n){
        this.n = n;
    }

    @Override
    public int hashCode(){//根据动态绑定机制, key.hashCode() 会跑到这里执行
        return 100;
    }
}


class B{
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode(){//根据动态绑定机制, key.hashCode() 会跑到这里执行
        return 200;
    }
}