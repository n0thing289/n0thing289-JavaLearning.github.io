package iostream_02.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

@SuppressWarnings({"all"})
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\outputstream_\\";
        String file = "data.dat";// 1. 序列化后保存的文件格式,不是纯文本,而是自己的一套格式保存
        String filepath = path + file;

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath));

        //老韩解读
        //读取 细节:读取的顺序要和序列化的顺序一致
        int i = objectInputStream.readInt();
        boolean b = objectInputStream.readBoolean();
        char c = objectInputStream.readChar();
        double v = objectInputStream.readDouble();
        String s = objectInputStream.readUTF();
//        objectInputStream.readChar();
        Object o = objectInputStream.readObject();

        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(v);
        System.out.println(s);
        System.out.println("运行类型 = " + o.getClass());
        System.out.println("dog信息 = " + o);

        objectInputStream.close();
        /**
         * 其实就是两点。1. 序列化和反序列化，对象类的路径要一致，刚刚是两个包路径的Dog了。 2. Dog类需要能够被反序列化访问到
         * 序列化的时候包名信息(之前的Dog是default)已经固定了，所以不能反序列化为不同包的dog
         * 第一次序列化的时候jvm会自动生成一个uid，然后修改类后又会生成一个uid，导致反序列化的时候两次的uid不一致，反序列化失败
         * 1. 如果希望调用Dog的方法,需要向下转型
         * 2. */

        /**
         * 细节:
         * */
    }
}
