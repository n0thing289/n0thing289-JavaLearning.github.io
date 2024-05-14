package v02hsp.view;
/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService
 */

import v02hsp.domain.House;
import v02hsp.utility.Utility;
import v02hsp.service.HouseService;

public class HouseView {
    //界面要用到的变量
    private boolean flag = true;
    private char choice = ' ';

    // 实例化HouseService对象
    private HouseService houseService = new HouseService(1);

    public void mainMenu() {
        do {
            System.out.println("\n\n--------------------房屋出租系统--------------------");
            System.out.print(
                    "\t\t1. 新增房源\n" +
                            "\t\t2. 查找房屋\n" +
                            "\t\t3. 删除房屋\n" +
                            "\t\t4. 修改房屋信息\n" +
                            "\t\t5. 房屋列表\n" +
                            "\t\t6. 退出\n" +
                            "请选择(1-6):");
            choice = Utility.readChar();// 日后要看Utility类源码
            switch (choice) {
                case '1':
//                    System.out.println("新增房屋");
                    addHouses();
                    break;
                case '2':
                    System.out.println("查找房屋");
                    searchHouses();
                    break;
                case '3':
//                    System.out.println("删除房屋");
                    removeHouses();
                    break;
                case '4':
//                    System.out.println("修改房屋信息");
                    updateHouses();
                    break;
                case '5':
//                    System.out.println("房屋列表");
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入有误请重新输入~");
            }

        } while (flag);
    }

    // 编写addHouses(),添加
    public void addHouses() {
        System.out.println("====================添加房屋====================");

        System.out.print("是否退出(-1退出):");
        String flag = Utility.readString(3, "1");
        if ("-1".equals(flag)) {
            return;
        }

        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String tel = Utility.readString(12);
        System.out.print("地址:");
        String position = Utility.readString(10);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态(为出租/已出租)");
        String state = Utility.readString(4);
        //创建新的house对象,是系统分配
        House newHouse = new House(0, name, tel, position, rent, state);
        houseService.add(newHouse);
    }

    // 编写listHouses(),显示房屋
    public void listHouses() {
        System.out.println("====================房屋列表====================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(出租/未出租)");
        House[] houses = houseService.list();// 拿到所有房屋的信息
//        System.out.println(house[0]);
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {// 不要显示null
                continue;
            }
            System.out.println(houses[i]);
        }
        System.out.println("====================房屋列表显示完毕====================\n");

    }

    // 编写removeHouses()
    public void removeHouses() {// 接收要铲除的id
        System.out.println("====================删除房屋====================");
        System.out.println("请输入待删除房屋的编号(-1退出)");
        int delId = Utility.readInt(1);
        if (delId == -1) {
            System.out.println("====================你放弃了删除====================");
            return;
        }
//        System.out.println("请确认是否删除(Y/N):");
        char choice = Utility.readConfirmSelection();//自带了循环
        if (choice == 'Y') {
            if (houseService.remove(delId)) {
                System.out.println("====================删除成功====================");
            } else {
                System.out.println("====================删除失败====================");
            }
        } else {
            System.out.println("====================未进行删除====================");
        }

    }

    public void searchHouses() {
        System.out.println("====================查找房屋====================");
        System.out.println("请输入待查找房屋的编号(-1退出)");
        int searchId = Utility.readInt(1);
        if (searchId == -1) {
            System.out.println("====================你放弃了查找====================");
            return;
        }

        House house = houseService.search(searchId);
        if (house == null) {
            System.out.println("没有查找到那个房屋信息");
        }

        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(出租/未出租)");
        System.out.println(house);
    }

    // 修改房屋信息
    public void updateHouses() {
        System.out.println("====================修改房屋====================");
        System.out.println("请输入待修改房屋的编号(-1退出)");
        int updateId = Utility.readInt(1);
        if (updateId == -1) {
            System.out.println("====================你放弃了修改====================");
            return;
        }

        House house = houseService.search(updateId);
        if (house == null) {
            System.out.println("你要修改的房屋信息不存在");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, house.getName()); // 如果用户直接回车说明用户不想修改
        System.out.print("电话(" + house.getTel() + "):");
        String tel = Utility.readString(12, house.getTel());
        System.out.print("地址(" + house.getPosition() + "):");
        String position = Utility.readString(10, house.getPosition());
        System.out.print("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(house.getRent());
        System.out.print("状态(" + house.getState() + ")(为出租/已出租)");
        String state = Utility.readString(4, house.getState());
        House newhouse = new House(house.getId(), name, tel, position, rent, state);
        houseService.update(updateId, newhouse);

    }

    public void exit() {
        if (Utility.readConfirmSelection() == 'Y') {
            flag = false;
            System.out.println("退出系统");
        }
    }


}
