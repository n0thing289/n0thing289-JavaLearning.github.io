package review.temp;

public class Work03 {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle(0, 1000);
        System.out.println(bmw);
        bmw.setSpeed(100);
        System.out.println("当前车速: " + bmw.getSpeed());
        bmw.speedDown();
        System.out.println("减速后车速: " + bmw.getSpeed());
    }
}
class Vehicle{
    private double speed;
    private double size;

    public void move(){
        System.out.println("启动ing...");
    }
    public void speedUp(int speed){
        if(!(speed > 0 && speed < 300)){
            System.out.println("超出额定速率");
        }
        this.speed = speed;
    }
    public void speedDown(){
        double defaultThr = 10;
        if(this.speed >= 10){
            this.speed -= defaultThr;
        }
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }
}