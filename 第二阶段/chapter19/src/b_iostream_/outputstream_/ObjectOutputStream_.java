package iostream_02.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings({"all"})
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\outputstream_\\";
        String file = "data.dat";// 1. 序列化后保存的文件格式,不是纯文本,而是自己的一套格式保存
        String filepath = path + file;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath));

        // 写入要序列化的数据
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.6);
        objectOutputStream.writeUTF("hsp");
//        objectOutputStream.writeChars("abxc");

        objectOutputStream.writeObject(new Dog("旺财", 2, "japan", "black"));


        objectOutputStream.close();
        System.out.println("数据保存完毕(序列化完毕)");
    }
}


