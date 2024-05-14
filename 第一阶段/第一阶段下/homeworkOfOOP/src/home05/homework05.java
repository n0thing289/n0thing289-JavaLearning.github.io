package home05;

public class homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("狗蛋", 200, 360, 1.0);
        Farmmer farmmer = new Farmmer("翠花", 100, 360, 1.0);
        Waiter waiter = new Waiter("赵只强", 100, 360, 1.0);
        Teacher teacher = new Teacher("风华", 100, 360, 1.0,200,200);
        Scientist smith = new Scientist("smith", 250, 360, 1.0);
        smith.setBonus(6000);

        worker.printSalary();
        farmmer.printSalary();
        waiter.printSalary();
        teacher.printSalary();
        smith.printSalary();

    }
}
