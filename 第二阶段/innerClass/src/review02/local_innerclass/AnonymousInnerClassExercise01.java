package review02.local_innerclass;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {
        new Outer02().method(new Picture() {
            @Override
            public void show() {
                System.out.println("这是一副好漂亮的画");
            }
        });
    }
}

interface Picture{
    public void show();
}

class Outer02{
    public void method(Picture p){
        p.show();
    }
}
