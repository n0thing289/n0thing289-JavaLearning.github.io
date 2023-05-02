package iostream_02.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception{
        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\iostream_\\reader_\\";
        String file = "凡人修仙传仙界篇2.txt";
        String filepath = path + file;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));

        String line;
        while((line = bufferedReader.readLine()/**按行读取, 返回字符串, 返回null时表示文件读取完毕*/) != null){
            System.out.println(line);//FileReader的打印不用ln
        }

        bufferedReader.close();
        /**
         * public void close() throws IOException {
         *         synchronized (lock) {
         *             if (in == null)
         *                 return;
         *             try {
         *                 in.close();//in就是private Reader in; 说明就是调用原本的close()
         *             } finally {
         *                 in = null;
         *                 cb = null;
         *             }
         *         }
         *     }
         */

    }
}
