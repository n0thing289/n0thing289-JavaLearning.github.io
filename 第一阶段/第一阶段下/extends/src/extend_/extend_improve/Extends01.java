package extend_.extend_improve;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "007";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showinfo();

        System.out.println("===================");
        Graduate graduate = new Graduate();
        graduate.name = "009";
        graduate.age = 24;
        graduate.testing();
        graduate.setScore(90);
        graduate.showinfo();
    }
}
