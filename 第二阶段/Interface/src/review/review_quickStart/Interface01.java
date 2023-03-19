package review.review_quickStart;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Computer computer = new Computer();
        Phone phone = new Phone();

        computer.work(camera);
        computer.work(phone);


    }
}
