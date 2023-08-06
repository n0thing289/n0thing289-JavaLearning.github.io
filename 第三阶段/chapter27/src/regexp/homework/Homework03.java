package regexp.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework03 {
    public static void main(String[] args) {
        String url = "https://www.bilibili.com:8080/video/a/z/z/z/BV1fh411y7R8.html";
//        String regStr = "^([a-zA-Z]+)://(.*):(\\d*)/(\\w*\\.\\w+)$";
        String regStr = "^^([a-zA-Z]+)://([a-zA-Z\\.]+):(\\d*)/[\\w/]*/([\\w\\.]+)$$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(url);
        int i = 0;
        while(matcher.find()){
            i++;
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
        }
        System.out.println(i);
    }
}
