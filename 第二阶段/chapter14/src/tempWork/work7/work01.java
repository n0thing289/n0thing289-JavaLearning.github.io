package tempWork.work7;

import java.util.Scanner;

public class work01 {
    private static final Scanner scan = new Scanner(System.in);
    static class Circle{
        private double x;
        private double y;
        private double r;

        public Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", r=" + r +
                    '}';
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入x, y ,z");
        System.out.print("x:");
        double x = scan.nextDouble();
        System.out.print("y:");
        double y = scan.nextDouble();
        System.out.print("r:");
        double r = scan.nextDouble();
        Circle circle = new Circle(x,y,r);
        System.out.println(circle);
    }
}

