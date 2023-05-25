package tempwork;

public class work03 {
    public static void go(){
        throw new RuntimeException("故意抛出");
    }
    public static void main(String[] args) {
        try {
            go();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
