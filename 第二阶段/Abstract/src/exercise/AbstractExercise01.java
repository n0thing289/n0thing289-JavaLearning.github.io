package exercise;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manage hwk = new Manage("hwk", 666, 10000, 1000);
        CommonEmployee qaz = new CommonEmployee("qaz", 001, 5000);

        System.out.println(hwk.work());
        System.out.println(qaz.work());
    }
}
