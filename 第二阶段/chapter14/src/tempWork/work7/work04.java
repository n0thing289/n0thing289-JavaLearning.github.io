package tempWork.work7;

public class work04 {
    public static void main(String[] args) {
        double length = Point.getPointToPointLength(5,
                2, 3, 4);
        System.out.println(length);
    }
}
class Point{
//    private double x1;
//    private double y2;
//    private double x2;
//    private double y2;

    public static double getPointToPointLength(double x1,double y1,double x2,double y2) {

        double a = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        double l = Math.sqrt(Math.abs(a));
        return l;
    }

}