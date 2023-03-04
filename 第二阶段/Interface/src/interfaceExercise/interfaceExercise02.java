package interfaceExercise;

public class interfaceExercise02 {
    public static void main(String[] args) {

    }

}

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A{
    public void pX(){
//        System.out.println(x);// 不是访问不到而是不明确你到底要访问哪一个？
        System.out.println(super.x);
//        System.out.println();
        System.out.println(A.x);


    }
}
