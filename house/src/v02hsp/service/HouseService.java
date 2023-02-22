package v02hsp.service;

import v02hsp.domain.House;
import v02hsp.utility.Utility;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter= 1;

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public int getHouseNums() {
        return houseNums;
    }

    public void setHouseNums(int houseNums) {
        this.houseNums = houseNums;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public HouseService(int size){
        houses = new House[size];

        House testHouse = new House(1, "jack", "123", "海淀区", 2000, "未出租");
        houses[0] = testHouse;
//        for(int i = 0;i<10;i++){// 假定有10个那么我先写死
//            houses[i] = testHouse;
//        }
    }

    // 5 -> 返回房屋列表
    public House[] list(){
        return houses;
    }

    // 1 -> 新增房屋的方法
    public boolean add(House newHouse){
        // 判断是否还可以继续添加(暂时不考虑数组扩容问题)
        if(houseNums == houses.length){
            System.out.println("数组已满");
            // 进行数组扩容
            // 1. 定义大一个长度新数组
            House[] new1house = new House[houses.length + 1];
            // 2. 将旧数组复制新数组
            for(int i= 0;i<houses.length;i++){
                new1house[i] = houses[i];
            }
            // 3. 修改旧数组的引用
            houses = new1house;
        }
        // 记住目前数组有一个测试的房屋对象
        // 把newHouse对象加入到数组,新增一个房屋
        houses[houseNums++] = newHouse;

        // 设计id自增长
        newHouse.setId(++idCounter);

        return true;

    }

    // 删除房屋
    public boolean remove(int delId){
        int index = -1;
        // 拿到要删除的下标
        for(int i=0;i<houseNums;i++){
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }

        for(int i=index;i<houseNums -1;i++){
            houses[i] = houses[i + 1];
        }
        houses[houseNums - 1] = null;
        houseNums--;

        return true;
    }

    // 查找房屋
    public House search(int searchId){
        // 根据你输入的id找到下标
        int index = -1;
        for(int i=0;i<houseNums;i++){
            if(searchId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return null;
        }

        // 这应该是界面曾做的事情!
//        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(出租/未出租)");
//        System.out.println(houses[index]);

        return houses[index];
    }

    public boolean update(int updateId, House newhouse){
        int index = -1;
        for(int i = 0;i<houseNums;i++){
            if(updateId == houses[i].getId()){
                index = i;
            }
        }

        if (index == -1){
            return false;
        }
        //
        houses[index] = newhouse;
        return true;
    }

}
