package beforepoly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 给狗喂食
    public void feed(Dog dog, Bone bone){
        System.out.println("Master:" + name + " 给 " + dog.getName() + "吃" + bone.getName());
    }
    //给鱼喂食
    public void feed(Cat cat, Fish fish){
        System.out.println("Master:" + name + " 给 " + cat.getName() + "吃" + fish.getName());
    }
}
