package regexp.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework01 {
    public static void main(String[] args) {
        String content = "hwk2892734127@qq.com";

        String regStr = "[\\w-]+@([a-zA-Z]+\\.)+][a-zA-Z]+";

        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }

        if(content.matches(regStr)){
            System.out.println("匹配成功");
        }else{
            System.out.println("匹配失败");
        }
    }
}
