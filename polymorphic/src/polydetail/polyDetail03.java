package polydetail;

public class polyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);
    }
}

class AA{ }
class BB extends AA{ }


