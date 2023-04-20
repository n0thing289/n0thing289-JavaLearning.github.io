package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        News news01 = new News("1新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News news02 = new News("2男子突然想起两个月前钓的鱼还在鱼兜里,捞起一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news01);
        arrayList.add(news02);

//        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        /**
         * 倒叙遍历有两种思路
         * 1. 先把集合反转,再用迭代器或者增强for遍历
         * 2. 因为是ArrayList, 可以用普通for反写,配合ArrayList.get(index)使用
         *
         */
        ArrayList ok = new ArrayList();
        for(Object o : arrayList){
            News n = (News)o;
            if(n.getTitle().length() > 15){
                String s = n.getTitle();
                String substring = s.substring(0, 15);
                /**
                 * 用截取＋ 拼接
                 */
                n.setTitle(substring + "...");
                ok.add(n);
            }
        }
        // 将处理好了的对象再加入到arrlist, 输出处理好了的arraylist
        Iterator iterator = ok.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class News{
    private String title;
    private String contain;

    public News(String title) {
        this.title = title;
//        this.contain = contain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}