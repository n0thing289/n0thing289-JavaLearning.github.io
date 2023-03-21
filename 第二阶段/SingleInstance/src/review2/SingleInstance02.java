package review2;

public class SingleInstance02 {
    public static void main(String[] args) {
        GirlFriend_ gf1 = GirlFriend_.work();
        GirlFriend_ gf2 = GirlFriend_.work();
        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gf2 == gf1);
    }
}

class GirlFriend_{
    private String name;
    private static GirlFriend_ gf;

    private GirlFriend_(String name){
        this.name = name;
    }

    public static GirlFriend_ work(){
        if(gf == null){
            gf = new GirlFriend_("xm");
        }
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend_{" +
                "name='" + name + '\'' +
                '}';
    }
}
