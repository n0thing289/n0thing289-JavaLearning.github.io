package extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xiaoming";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showinfo();

        System.out.println("===");
        Graduate graduate = new Graduate();
        graduate.name = "ming";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showinfo();

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print("\t" + j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
}
