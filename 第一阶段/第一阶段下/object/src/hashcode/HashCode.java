package hashcode;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        AA aa2 = aa;
        System.out.println(aa.hashCode());
        System.out.println(bb.hashCode());
        System.out.println(aa2.hashCode());
    }
}

class AA{}
class BB{}
