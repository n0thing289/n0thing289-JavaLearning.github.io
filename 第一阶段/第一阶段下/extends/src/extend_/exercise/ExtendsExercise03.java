package extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("i3","海盗船16g","西部数据","HONOR");
        Notepad notepad = new Notepad("奔腾","致态16g","金士顿512g","black");

//        pc.brand = "HONOR";
//        notepad.color = "black";

//        pc.CPU = "i3";
//        pc.RAM = "海盗船16g";
//        pc.disk = "西部数据";

//        notepad.CPU = "奔腾";
//        notepad.RAM = "致态16g";
//        notepad.disk = "金士顿512g";

        System.out.println("pc brand: " + pc.getBrand() + pc.getDetail());
        System.out.println("=================");
        System.out.println("notepad color" + notepad.getColor() + notepad.getDetail());
    }
}

class Computer {
    private String CPU;
    private String RAM;
    private String disk;

    public Computer(String CPU, String RAM, String disk){
        this.CPU = CPU;
        this.RAM = RAM;
        this.disk = disk;
    }

    public String  getDetail() {
        return "   cpu: " + CPU + "  RAM: " + RAM + "  disk: " + disk;
    }
}

class PC extends Computer{
    private String brand;
    public PC(String CPU, String RAM, String disk, String brand){
        super(CPU, RAM, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}


class Notepad extends Computer{
    private String color;

    public Notepad(String CPU, String RAM, String disk, String color) {
        super(CPU, RAM, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
