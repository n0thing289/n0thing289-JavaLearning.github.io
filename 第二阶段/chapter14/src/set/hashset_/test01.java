package set.hashset_;

public class test01 {
    public static void main(String[] args) {
        AA b = new BB();
        System.out.println(b.getS2());
        System.out.println(b.getS1());
        System.out.println(b.s2);
    }
}

class AA {
    private String s1 = "A1";
    public String s2 = "A2";

    public String getS2() {
        return s2;
    }

    public String getS1() {
        return s1;
    }

}

class BB extends AA {
    private String s1 = "B1";
    public String s2 = "B2";

    public String getS2() {
        return s2;
    }

    public String getS1() {
        return s1;
    }
}




