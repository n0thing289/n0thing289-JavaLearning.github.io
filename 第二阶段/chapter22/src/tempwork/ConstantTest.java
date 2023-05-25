package tempwork;

public class ConstantTest implements Constants{
    public static void main(String[] args) {
        int value = Constants.MAX - Constants.MIN;
        System.out.println(value);
    }
}
interface Constants{
    public final static int MAX = 10000;
    public final static int MIN = 100;
}
