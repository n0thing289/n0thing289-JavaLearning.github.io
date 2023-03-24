package exercise.review;

public class exercise01 {
    public static void main(String[] args) {

        Outer01 outer01 = new Outer01();
        outer01.method(new IA() {
            @Override
            public void show() {
                System.out.println("这是一个好帅的画");
            }
        });
    }
}


class Outer01{
    public void method(IA ia){
        ia.show();
    }
}
interface IA{
    public void show();
}
