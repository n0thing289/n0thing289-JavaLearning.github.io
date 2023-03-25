public class Homework04 {//匿名内部类经典使用场景
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer(){
            @Override
            public double work(double x1, double x2){
                return x1 + x2;
            }
        }, 10,20);


        cellphone.testWork(new Computer() {
            @Override
            public double work(double x1, double x2) {
                return x1 * x2;
            }
        }, 10,10);
    }
}

interface Computer{
    public double work(double x1, double x2);
}

class Cellphone{
    public void testWork(Computer computer, double x1, double x2){
        double re = computer.work(x1, x2);
        System.out.println(re);
    }
}