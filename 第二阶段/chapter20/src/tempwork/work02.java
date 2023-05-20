package tempwork;

public class work02 {
    public static void main(String[] args) {
        Car car = new Car("bmw", "pink", 4);
        Truck truck = new Truck("jiangling", "red", 1000);
        Bicyle bicyle = new Bicyle("tranx", "black", 24);

        car.show();
        truck.show();
        bicyle.show();
    }
}
class Vehicle{
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
class Car extends Vehicle implements Fueling{
    private int passengers;

    public Car(String brand, String color, int passengers) {
        super(brand, color);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", passengers=" + passengers +
                '}';
    }

    @Override
    public String type() {
        return "汽油";
    }
}

class Truck extends Vehicle implements Fueling{
    private int weight;

    public Truck(String brand, String color, int weight) {
        super(brand, color);
        this.weight = weight;
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", weight=" + weight + " kg" +
                "}";
    }

    @Override
    public String type() {
        return "柴油";
    }
}

class Bicyle extends Vehicle{
    private int limit;

    public Bicyle(String brand, String color, int limit) {
        super(brand, color);
        this.limit = limit;
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public String toString() {
        return "Bicyle{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", limit=" + limit + " km/h"+
                '}';
    }
}