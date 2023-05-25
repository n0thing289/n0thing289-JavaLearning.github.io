package tempwork;

public class ExceptionTest01 {
    public static void main(String[] args) {
        try {
            int value = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("ok");
        }
    }
}
