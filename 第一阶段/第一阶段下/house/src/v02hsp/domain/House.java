package v02hsp.domain;

public class House {
    private int id;
    private String name;
    private String tel;
    private String position;
    private int rent;
    private String state;

    public House(int id, String name, String tel, String position, int rent, String state) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.position = position;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {//打印一个对象的时候默认打印toString()返回的字符串,但是我们一般重写
        return id +
                "\t\t" + name +
                "\t\t" + tel +
                "\t\t" + position +
                "\t\t" + rent +
                "\t\t" + state;
    }
}
