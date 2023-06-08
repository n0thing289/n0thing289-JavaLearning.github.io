package tempwork;

import java.util.ArrayList;
import java.util.HashMap;

public class work01 {
    public static void main(String[] args) {
        Item item = new Item("只因你太美", "蔡徐坤", "披巾为王，伴坤远航");
        CD cd = new CD("只因你太美", "蔡徐坤", "披巾为王，伴坤远航", 100);
        DVD dvd = new DVD("只因你太美", "蔡徐坤", "披巾为王，伴坤远航", 25);

        item.print();
        cd.print();
        dvd.print();

        Database database = new Database();
        database.add(cd);
        database.add(dvd);
        database.add(item);
        database.list();

        NationCollection nationCollection = new NationCollection();
        nationCollection.put("CN", "中华人民共和国");
        nationCollection.put("US", "阿美利卡");
        nationCollection.put("UK", "大不列颠");

        System.out.println(nationCollection.get("CN"));
        nationCollection.list();
        nationCollection.remove("US");
        nationCollection.list();
    }
}
class Item{
    private String title;
    private String director;
    private String comment;

    public Item() {
    }

    public Item(String title, String director, String comment) {
        this.title = title;
        this.director = director;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

class CD extends Item{
    private int num;

    public CD() {
    }

    public CD(String title, String director, String comment, int num) {
        super(title, director, comment);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String s = super.toString();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(s.length()-1, ", num='" + num + '\'');
        return  stringBuilder.toString();
    }
}

class DVD extends Item{
    private int playingTime;

    public DVD() {
    }

    public DVD(String title, String director, String comment, int playingTime) {
        super(title, director, comment);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String s = super.toString();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.insert(s.length()-1, ", playingTime='" + playingTime  + "min"+ '\'');
        return  stringBuilder.toString();
    }
}
class Database{
    private ArrayList<Item> db = new ArrayList<>();

    public Database() {
    }

    public Database(ArrayList<Item> db) {
        this.db = db;
    }

    public void add(Item item){
        db.add(item);
    }
    public void list(){
        System.out.println(db.toString());
    }


}
class NationCollection{
    private HashMap<String, String > hm = new HashMap<>();

    public String get(String s){
        return hm.get(s);
    }

    public void remove(String s){
        hm.remove(s);
    }

    public void put(String s, String s2){
        hm.put(s,s2);
    }
    public void list(){
        System.out.println(hm.toString());
    }
}