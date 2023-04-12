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
}
