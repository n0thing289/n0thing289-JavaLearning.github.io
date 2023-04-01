package StringBuffer;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //增
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);// 输出的时候本质上是调用他的toString()

        //删
        s.delete(11,14);//左闭右开
        System.out.println(s);//hello,张三丰赵敏true10.5

        //改
        s.replace(9,11,"周芷若");
        System.out.println(s);//hello,张三丰周芷若true10.5

        //查 查找字串再字符串种第一次出现的索引,没有找到返回-1
        int indexof = s.indexOf("张三丰");
        System.out.println(indexof);//6

        //插
        s.insert(9,"赵敏");
        System.out.println(s);//hello,张三丰赵敏周芷若true10.5

        //长度
        System.out.println(s.length());
        System.out.println(s);
    }
}
