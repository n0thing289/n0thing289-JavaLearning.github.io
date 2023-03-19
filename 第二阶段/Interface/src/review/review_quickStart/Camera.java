package review.review_quickStart;

public class Camera implements UsbInterface{
    public void link(){
        System.out.println("相机连接中");
    }

    public void stop(){
        System.out.println("相机断开连接");
    }
}
