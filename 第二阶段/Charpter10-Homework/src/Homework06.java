public class Homework06 {
    public static void main(String[] args) {
        Horse horse = VehiclesFactory.getHorse();
        Boat boat = VehiclesFactory.getBoat();

        Person tang = new Person("唐僧", null);

//        System.out.println("正常大陆走");
        tang.common();

//        System.out.println("遇到河流");
        tang.passRiver();

        tang.common();

        tang.passFireMountain();

    }
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{
    @Override
    public void work(){
        System.out.println("大陆,骑马ing...");
    }
}

class Boat implements Vehicles{
    @Override
    public void work(){
        System.out.println("遇到河流,划船ing...");
    }
}

//额外拓展,过火焰山
class Plane implements Vehicles{
    @Override
    public void work(){
        System.out.println("遇到火焰山坐飞机飞过去");
    }
}

class VehiclesFactory{
    private static Horse horse = new Horse();
    private VehiclesFactory(){}
    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }

    public static Plane getPlane(){
        return new Plane();
    }
}

class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles){
        this.name = name;
        this.vehicles = vehicles;
    }

    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }

        vehicles.work();
    }

    public void passRiver(){
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }

        vehicles.work();
    }

    public void passFireMountain(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}