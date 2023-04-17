package map.source;

import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }

        System.out.println(hashMap.size());
        //hash一样，但是地址不一样，内容一样

        //结点超过8， 数组达到64，进行HashMap$TreeNode

        //布置一个任务,自己设置代码去验证,table的扩容
    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        A a = (A) o;
//        return num == a.num;
//    }

    @Override
    public int hashCode() {
        return 100;
    }
}