package finalize;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");

        bmw = null;

        System.gc();
        System.out.println("程序结束");
    }

}
class Car{
    public String name;
    Car(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车->" + name);
    }
}