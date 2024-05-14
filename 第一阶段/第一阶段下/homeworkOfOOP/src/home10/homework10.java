package home10;

import javax.print.Doc;

public class homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack1", 20, "牙科医生", 'm', 20000);
        Doctor doctor2 = new Doctor("jack1", 20, "牙科医生", 'm', 20000);
        System.out.println(doctor.equals(doctor2));

    }
}
