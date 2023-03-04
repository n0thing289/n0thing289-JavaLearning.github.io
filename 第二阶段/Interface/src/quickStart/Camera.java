package quickStart;

public class Camera implements UsbInterface{
    // 实现厂商规定的接口
    public void start(){
        System.out.println("相机开始工作");
    }
    public void stop(){
        System.out.println("相机停止工作");
    }
}
