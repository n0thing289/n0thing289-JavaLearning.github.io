package exerise;

public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("===所有星期信息如下===");
        Week[] weeks = Week.values();
        for(Week w:weeks){
            System.out.println(w.getDay());
        }
    }
}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String day;
    private Week(String d){
        this.day = d;
    };

    public String getDay() {
        return day;
    }

}