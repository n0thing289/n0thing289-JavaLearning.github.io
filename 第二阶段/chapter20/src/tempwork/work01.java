package tempwork;

public class work01 {
    public static void main(String[] args) {
        Gra gra = new Gra();
        FastEther fastEther = new FastEther();
        sound sound = new sound();

        computer(gra);
        System.out.println();
        computer(fastEther);
        System.out.println();
        computer(sound);
    }

    public static void computer(PCI pci){
        pci.start();
        pci.stop();
    }
}
interface PCI{
    public void start();
    public void stop();
}
class Gra implements PCI{

    @Override
    public void start() {
        System.out.println("显卡启动。。。");
    }

    @Override
    public void stop() {
        System.out.println("显卡关闭。。。");
    }
}
class FastEther implements PCI{

    @Override
    public void start() {
        System.out.println("网卡启动");
    }

    @Override
    public void stop() {
        System.out.println("网卡关闭");
    }
}
class sound implements PCI{

    @Override
    public void start() {
        System.out.println("声卡启动。。。");
    }

    @Override
    public void stop() {
        System.out.println("声卡关闭。。。");
    }
}
