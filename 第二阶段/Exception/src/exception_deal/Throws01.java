package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public void f1() throws FileNotFoundException, NullPointerException, Exception{

//        try {
//            FileInputStream fileInputStream = new FileInputStream("d://a.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        FileInputStream fileInputStream = new FileInputStream("d://a.txt");

    }
}
