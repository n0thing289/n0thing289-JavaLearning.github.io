package iostream_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\writer_\\";
        String file = "a.txt";
        String filepath = path + file;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath,true));

        bufferedWriter.write("hello hsp");
        bufferedWriter.newLine();/**根据系统添加换行符*/
        bufferedWriter.write("hello hsp\n");
        bufferedWriter.write("hello hsp\n");
        //建议插入换行符

        bufferedWriter.close();
    }
}
