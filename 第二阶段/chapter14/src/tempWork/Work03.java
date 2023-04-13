package tempWork;

public class Work03 {
    public static void main(String[] args) {
        double d1 = 100;
        double d2 = 200;
        System.out.println("before : d1 = " + d1 + "  d2 = " + d2);
        swap(d1, d2);

    }

    public static void swap(double d1, double d2) {
        double temp;
        temp = d1;
        d1 = d2;
        d2 = temp;
        System.out.println("after : d1 = " + d1 + "  d2 = " + d2);


    }
}
