public class Debug01 {
    public static void main(String[] args) {
        //研究变量变化
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i= " + i);
            System.out.println("sum= "+ sum);
        }
        System.out.println("end...");
    }
}
