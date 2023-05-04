package review.temp;

public class Work01 {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(1, 2, 3, 4);
        System.out.println(rectangle);
        rectangle rectangle1 = new rectangle(1, 2, -1, 1);
        System.out.println(rectangle1);
    }
}
class rectangle{
    private Double height = null;
    private Double weight = null;
    private Double x, y = null;

    public rectangle(double height, double weight, double x, double y) {
        if(!(x > 0 && y > 0)){
            System.out.println("x,y 必须是第一象限点,添加失败!");
            return;
        }
        this.height = height;
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "height=" + height +
                ", weight=" + weight +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
