public class Homework02 {
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    @SuppressWarnings({"all"})
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber(){
        return serialNumber;
    }


    public Frock(){
        getNextNum();
        serialNumber = currentNum;
    }
}

class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();

        System.out.println(frock.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}