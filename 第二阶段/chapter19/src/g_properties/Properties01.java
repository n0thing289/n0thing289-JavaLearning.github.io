package g_properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //1. 读取mysql.properties
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);

            String[] split = line.split("=");
            System.out.println(split[0] + "=" + split[1]);
            //目前在加一个if 和equals已经可以实现了,但是效率不高
            bufferedReader.close();
        }

    }
}
