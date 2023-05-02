package e_transformation;

import java.io.*;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {

        String path = "J:\\编程文件\\javase韩顺平\\n0thing289-JavaLearning.github.io\\第二阶段\\chapter19\\src\\transformation\\";
        String file = "a.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path + file));

        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();

        /**
         * 国标码ANSI， 看你地区确定
         * 怎么解决？
         *
         * */
    }
}
