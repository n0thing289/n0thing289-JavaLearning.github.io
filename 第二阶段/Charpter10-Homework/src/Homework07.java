public class Homework07 {
    public static void main(String[] args) {

        Car_ car = new Car_(41);
        car.testInnerMethod();
        Car_ car1 = new Car_(-1);
        car1.testInnerMethod();
    }
}

class Car_{
    private double temperature;
    class Air{
        public void flow(double temperature){
            if(temperature > 40){
                System.out.println("吹冷气");
            }
            else if(temperature < 0){
                System.out.println("吹暖气");
            }
        }
    }
    public Car_(double t){
        this.temperature = t;
    }

    public void testInnerMethod(){
        Air air = new Air();
        air.flow(this.temperature);
    }
}