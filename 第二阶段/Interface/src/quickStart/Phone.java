package quickStart;

public class Phone implements UsbInterface{
    // 子类必须实现所有接口方法
    public void start(){
        System.out.println("手机开始工作");
    };
    public void stop(){
        System.out.println("手机停止工作");
    }
}
