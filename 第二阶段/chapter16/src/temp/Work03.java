package temp;

public class Work03 {
    public static void main(String[] args) {
        BWPrinter bwp = new BWPrinter("黑白打印机");
        ColorPrinter cp = new ColorPrinter("彩色打印机");
        System.out.println(bwp);
        System.out.println(cp);
    }
}

class Print{
    private String type;

    public Print(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Print{" +
                "type='" + type + '\'' +
                '}';
    }
}
class ColorPrinter extends Print{
    public ColorPrinter(String type) {
        super(type);
    }
}
class BWPrinter extends Print{
    public BWPrinter(String type) {
        super(type);
    }
}