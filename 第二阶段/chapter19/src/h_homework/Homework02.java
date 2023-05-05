package h_homework;

import org.junit.Test;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String path = "src\\h_homework\\";
        String file = "凡人修仙传仙界篇2.txt";
        String filepath = path + file;

        FileReader fileReader = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fileReader);

        String readString;
        int line = 1;
        while((readString = br.readLine()) != null){
            System.out.println(line++ +" "+ readString);
        }
        br.close();
    }

    @Test
    public void transform() throws IOException {
        String path = "src\\h_homework\\";
        String file = "凡人修仙传仙界篇2.txt";
        String filepath = path + file;

        FileInputStream fileInputStream = new FileInputStream(filepath);
        InputStreamReader isr = new InputStreamReader(fileInputStream, "gbk");
        BufferedReader bufferedReader = new BufferedReader(isr);

        String readString;
        int line = 1;
        while((readString = bufferedReader.readLine()) != null){
            System.out.println(line++ + readString);
        }

        bufferedReader.close();
    }
}
