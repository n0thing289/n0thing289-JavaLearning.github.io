package LocalDateTime_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时" + ldt.getHour());
        System.out.println("分" + ldt.getMinute());
        System.out.println("秒" + ldt.getSecond());
        System.out.println("秒" + ldt.getSecond());

        //
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();

        //2. 使用DateTimeFormat对象来格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

        //3. Instant时间戳


    }
}
