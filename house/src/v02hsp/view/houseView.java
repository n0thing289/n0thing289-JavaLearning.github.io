package v02hsp.view;
/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用HouseService

 */
public class houseView {
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
            String choice = scan.next();
            switch (choice) {
                case "1":
//                    System.out.println("yes");
                    newHouse();
                    break;
                case "2":
                    searchHouse();
                    break;
                case "3":
                    deleteHouse();
                    break;
                case "4":
                    chanceHouse();
                    break;
                case "5":
                    showHouseArr();
                    break;
                case "6":
                    exit();
                    break;
                default:
                    System.out.println("输入有误请重新输入~");
            }

        } while (flag);
    }
}
