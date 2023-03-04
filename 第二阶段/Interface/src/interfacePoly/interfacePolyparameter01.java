package interfacePoly;

public class interfacePolyparameter01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone_ phone = new Phone_();
        Camera_ camera = new Camera_();

        // 接口的引用指向实现了接口的类的对象实例
        computer.work(phone);
        computer.work(camera);
    }
}

interface Usb{
    public void start();
    public void stop();
}
class Phone_ implements Usb{
    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }
    public void stop(){
        System.out.println("手机停止工作...");
    }

    // 自己有的特殊的方法
    public void call(){
        System.out.println("手机打电话");
    }
}

class Camera_ implements Usb{
    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }
    public  void stop(){
        System.out.println("相机停止工作...");
    }
}
class Computer{
    public void work(Usb usb){
        usb.start();
        usb.stop();
    }
}

