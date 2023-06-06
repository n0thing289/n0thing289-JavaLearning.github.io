package reflection.class_;

public class Car {
    public String brand = "bmw";
    public int price = 50000;
    public String color = "color";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
