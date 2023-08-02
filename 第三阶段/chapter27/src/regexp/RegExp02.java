package regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(abc(123(";

        //
        String regStr = "\\$";

        //
        Pattern compile = Pattern.compile(regStr);

        //
        Matcher matcher = compile.matcher(content);

        //
        while(matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
