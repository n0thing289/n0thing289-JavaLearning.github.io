package quickStart;

public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
        // 给我的感觉像向上转型加抽象设计,动态绑定
    }
}
