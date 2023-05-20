package tempwork;

public class work03 {
    public static void main(String[] args) {
        Car car = new Car("bmw", "pink", 4);
        Truck truck = new Truck("jiangling", "red", 1000);
        FillingStation.addFuel(car);
        FillingStation.addFuel(truck);
    }
}
interface Fueling{
    public String type();
}
class FillingStation{
    public static void addFuel(Fueling fueling){

        if(fueling.type().equals("汽油") && fueling instanceof Car){
            Car c = (Car)fueling;
            System.out.println(c.getBrand() + " 使用1号油枪(汽油)开始加油");
        }else if(fueling.type().equals("柴油") && fueling instanceof Truck){
            Truck t = (Truck)fueling;
            System.out.println(t.getBrand() + " 使用2号油枪(柴油)开始加油");
        }
    }
}