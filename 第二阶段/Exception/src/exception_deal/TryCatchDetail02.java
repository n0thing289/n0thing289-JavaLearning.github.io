public class TryCatchDetail02 {
    public static void main(String[] args) {
        Person abc = new Person("abc");
        abc = null;
        System.out.println("name:" + abc.getName());
        int n1 = 1;
        int n2 = 0;
        int res = n1 / n2;
        System.out.println("res:" + res);
    }
}
class Person{
    private String name;
    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
