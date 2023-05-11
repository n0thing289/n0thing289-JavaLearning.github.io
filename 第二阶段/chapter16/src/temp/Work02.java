package temp;

public class Work02 {
    public static void main(String[] args) {
        YouChe youChe = new YouChe("bmw", "fuel");
        DianChe dianChe = new DianChe("byd", "electricity");
        youChe.printInfo();
        youChe.changeSpeed(1);
        dianChe.printInfo();
        dianChe.changeSpeed(2);
    }
}

class Car {
    private String brand;
    private String type;

    public void printInfo() {
        System.out.println(this);
    }

    public void changeSpeed(int type) {
        if (type == 1) {
            System.out.println(this + "加速");
        } else if (type == 2) {
            System.out.println(this + "减速");
        }
    }

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class YouChe extends Car{
    public YouChe(String brand, String type) {
        super(brand, type);
    }
}

class DianChe extends Car{
    public DianChe(String brand, String type) {
        super(brand, type);
    }
}