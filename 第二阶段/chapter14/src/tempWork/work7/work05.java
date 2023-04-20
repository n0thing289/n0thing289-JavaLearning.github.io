package tempWork.work7;

public class work05 {
    public static void main(String[] args) {
        double area = Rectangle.getArea(2,2);
        System.out.println(area);
    }
}
class Rectangle{
    public static double getArea(double x,double y){
        return x*y;
    }
}
