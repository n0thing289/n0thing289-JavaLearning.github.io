package Calendar_;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("c = " + c);

        System.out.println("年 " + c.get(Calendar.YEAR));
        System.out.println("月 " + (c.get(Calendar.MONTH) + 1));
        System.out.println("日 " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时 " + c.get(Calendar.HOUR));
        System.out.println("分钟 " +  c.get(Calendar.MINUTE));
        System.out.println("秒 " + c.get(Calendar.SECOND));

        //没有提供对应的格式化的类,要程序员之间组合
        //如果要24小时制的 Calendar.HOUR ==> Calendar.HOUR_OF_DAY
    }
}
