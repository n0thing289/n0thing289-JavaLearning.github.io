package regexp.homework;

public class Homework02 {
    public static void main(String[] args) {
        String content = "-0.3";
        String regStr = "^[-+]?([1-9]\\d*|0?)(\\.\\d+)?$";
        if(content.matches(regStr)){
            System.out.println("匹配成功,事整数或者小数");
        }else{
            System.out.println("匹配失败");
        }
    }
}
