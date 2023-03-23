package menber_innerclass.test;

public class test01 {
    public static int n1 = 10;
    public int n2 = 20;
    static class inner01{
        public void hi(){
            //访问外部类的静态成员
            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);
        }
    }
}
