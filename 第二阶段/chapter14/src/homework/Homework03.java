package homework;

import java.util.*;

@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);

        System.out.println(hashMap);
        hashMap.put("jack", 2600);//替换工资

        Set entryset = hashMap.entrySet();//取出来的就是一个一个的entry
        for (Object o:entryset){
            Map.Entry entry = (Map.Entry)o;
            Integer newSalary = (Integer)entry.getValue() + 100;
            hashMap.put(entry.getKey(), newSalary);
//            System.out.println(newSalary);
        }

        //key
        Set keyset = hashMap.keySet();
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println("员工:" + next);
        }

        //value
        Collection value = hashMap.values();
        for(Object o: value){
            int next = (Integer)o;
            System.out.println(o);
        }

        System.out.println(hashMap);
    }
}
