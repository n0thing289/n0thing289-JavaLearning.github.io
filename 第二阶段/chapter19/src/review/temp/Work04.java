package review.temp;

import java.util.ArrayList;
import java.util.List;

public class Work04 {
    public static void main(String[] args) {
        System.out.println("张三买了新房");
        ArrayList<HouseItem> houseItems = new ArrayList<>();
        House bigHouse = new House("别墅", 200, houseItems);

        System.out.println("张三采购家具中...");
        HouseItem bed = new HouseItem("席梦思bed", 4);
        HouseItem chest = new HouseItem("chest", 2);
        HouseItem table = new HouseItem("table", 1.5);

        System.out.println("张三添加家具中...");
        bigHouse.addItem(bed);
        bigHouse.addItem(chest);
        bigHouse.addItem(table);

        System.out.println(bigHouse);
    }
}

class House{
    private String houseType;
    private double houseArea;
    private ArrayList<HouseItem> itemList;
    private double surplusArea;

    public void addItem(HouseItem houseItem){
        if(!((surplusArea = houseArea - houseItem.getArea()) > 0)){
            System.out.println("添加失败,房子的面积不够了");
        }
        itemList.add(houseItem);
        houseArea = surplusArea;
    }

    public House(String houseType, double houseArea, ArrayList<HouseItem> itemList) {
        this.houseType = houseType;
        this.houseArea = houseArea;
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", houseArea=" + houseArea +
                ", itemList=" + itemList +
                ", surplusArea=" + surplusArea +
                '}';
    }
}
class HouseItem{
    private String name;
    private double area;

    public HouseItem(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return  "\n" + "HouseItem{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}