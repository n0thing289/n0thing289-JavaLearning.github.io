package quickStart;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();

        // 这里就像把手机和相机插进电脑usb接口
        computer.work(camera);
        computer.work(phone);
    }
}
