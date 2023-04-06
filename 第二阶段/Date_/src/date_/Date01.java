package date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;//我们学的日期类是util包下的

public class Date01 {
    public static void main(String[] args) throws ParseException {
        //1. 获取当前系统时间
        //2. 这里的date
        //3. 默认输出外国的格式，我像转换格式
        Date d1 = new Date();
        System.out.println("当前日期=" + d1);
        Date d2 = new Date(9234567);//通过指定毫秒数得到时间
        System.out.println(d2);//获取某个时间对应的毫秒数
//
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");//指定相应的格式
        String format = sdf.format(d1);
        System.out.println(format);
//
        //把格式化了的字符串转成一个Date对象
        //得到的Date 任然在输出时,还是按照国外的形式, 想要换格式输出就需要format
        // 3. String -> Date 使用的sdf格式需要和你的String格式一样,否则会抛出异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);//sdf.format(parse)
    }
}
