package exercise;

public class FinalExercise01 {
    public static void main(String[] args) {
        circle circle = new circle(5);
        System.out.println(circle.getArea());
    }
}
class circle{
    private double radius;

    private final double PI;// = 3.14;
//    {
//        PI = 3.14;
//    }
    circle(double radius){
        this.radius = radius;
        PI = 3.14;
    }

    public double getArea(){
        return PI * (radius * radius);
    }

}
