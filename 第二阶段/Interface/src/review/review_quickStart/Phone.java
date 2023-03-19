package review.review_quickStart;

public class Phone implements UsbInterface{
    public void link(){
        System.out.println("手机连接中");
    }
    public void stop(){
        System.out.println("手机断开连接");
    }
}
