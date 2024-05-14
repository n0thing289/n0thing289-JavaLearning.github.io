package v01;

import java.util.Scanner;

public class HouseRental {

    //模拟数据的存储,将所有的房屋存储到houseArr中
    String[][] houseArr = new String[0][0];
    //初始化Scanner类
    Scanner scan = new Scanner(System.in);
    //设置主菜单控制循环用的变量,默认是true;
    boolean flag = true;

    //添加房屋用到的字符串数组
    String[] information = {"姓名", "电话", "地址", "月租", "状态(未出租/已出租)"};

    // 编写主菜单
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

    // 1. 新增房源
    public void newHouse() {
        //新蹭意味着,每调用一次,就要对数组进行扩容一个元素大小
        //一个房源信息有5条
        //  1. 定义一个长度为旧数组长度+1, 每一个新一维数组长度为5的新数组
        int houseLen = houseArr.length + 1;
        String[][] newHouseArr = new String[houseLen][information.length];
//        System.out.println(newHouseArr);
        //  2. 将旧数组复制给新数组
        for (int i = 0; i < houseArr.length; i++) {
            newHouseArr[i] = houseArr[i];
        }
        //  3. 获取新的输入(循环)添加到新数组中
        //    3.1 获取输入存入一维数组
        System.out.println("--------------------添加房屋--------------------\n");
        for (int i = 0; i < information.length; i++) {
            System.out.print(information[i] + ':');
            newHouseArr[newHouseArr.length - 1][i] = information[i] + ':' + scan.next();
        }
        //    3.2 修改旧数组的引用
        houseArr = newHouseArr;
        System.out.println("--------------------添加完成--------------------\n");
    }

    // 2. 查找房屋
    public void searchHouse() {
        System.out.println("--------------------查找房屋--------------------\n");
        System.out.print("请输入你要查找的id(" + houseArr.length + "):");
        int id = scan.nextInt();
        if (id - 1 > houseArr.length) {
            System.out.println("--------------------没有该房屋--------------------\n");
            return;
        }
        for (int i = 0; i < information.length; i++) {
            System.out.print(houseArr[id - 1][i] + "\t\t\t\t");
        }
        System.out.println("\n--------------------查找完成--------------------");


    }

    //TODO 3. 删除房屋
    public void deleteHouse() {
        System.out.println("--------------------删除房屋--------------------\n");
        //删除房屋本质上的数组的缩减
        // 1. 定义一个新数组，大小是原数组的减一
        String[][] newHouseArr = new String[houseArr.length - 1][5];//创建一个长度为houseArr.length-1的二维数组,其中每一个一维数组是5个长度
        // 2. 判断用户输入的是不是n,如果是就不继续向下运行
        System.out.print("请选择待删除房屋编号(-1退出):");
        int num = scan.nextInt();
        System.out.println("确认是否删除(y/n)!请小心选择!");
        System.out.println("请输入你的选择(y/n):");
        char choice = scan.next().charAt(0);
        if (choice == 'n') {
            return;
        }

        // 3. 遍历旧数组，将旧数组的值复制给新数组（条件判断：如果遇到空，就跳过继续复制
        // ->如果num-1和id一样说明就是要删除的值,那么我可以复制的时候跳过当前这一步,
        // 也达到删除的效果）
        for (int i = 0; i < houseArr.length; i++) {
            if (num - 1 == i) {
                continue;
            }
            //TODO 不能删除第一个的bug
            for (int j = 0; j < 5; j++) {
                if (i == 1 && newHouseArr.length == 1) {//当这种情况出现时,先这样解决
                    System.out.println("yes");
                    newHouseArr[i - 1][j] = houseArr[i][j];
                } else {
                    newHouseArr[i][j] = houseArr[i][j];
                }
            }
        }
        // 4. 修改旧数组的引用
        houseArr = newHouseArr;
        System.out.println("--------------------删除完成--------------------\n");


    }

    // 4. 修改房屋信息
    public void chanceHouse() {
        System.out.println("--------------------修改房屋--------------------");
        // 1. 定义一个长度和原来一样的新数组

        String[][] newHouseArr = new String[houseArr.length][5];
        // 2. 复制一份给新数组
        for (int i = 0; i < houseArr.length; i++) {
            for (int j = 0; j < 5; j++) {
                newHouseArr[i][j] = houseArr[i][j];
            }
        }
        // 3. 修改新数组
        System.out.print("请选择待修改房屋编号(-1退出):");
        int choice = scan.nextInt();
        if (choice == -1) {
            return;
        }
        // 3.1 找到要修改的房屋
        for (int i = 0; i < newHouseArr.length; i++) {
            if (choice - 1 != i) {
                continue;
            }

            for (int j = 0; j < 5; j++) {

                System.out.print(information[j] + "(" + houseArr[i][j].split(":")[1] + "):");
                // TODO 将字符串拆分
                String temp = scan.next();
                // 如果是空就将原来的值赋值给info
                // 怎么判断回车就是空?
                String info = "".equals(temp) ? houseArr[i][j].split(":")[1] : temp;
                newHouseArr[i][j] = information[j] + ':' + info;
            }
        }
        // 4. 修改旧数组的引用
        houseArr = newHouseArr;
        System.out.println("--------------------修改完成--------------------");
    }

    // 5. 房屋列表
    public void showHouseArr() {
        System.out.println("--------------------房屋列表--------------------");
        // 将最上面一信息栏遍历
        System.out.print("编号\t\t\t\t");
        for (int j = 0; j < 5; j++) {

            System.out.print(information[j] + "\t\t\t\t");
        }
        // 头行输出完后换行
        System.out.println("");
        // 遍历houseArr
        for (int i = 0; i < houseArr.length; i++) {
            System.out.print((i + 1) + "\t\t\t\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(houseArr[i][j].split(":")[1] + "\t\t\t\t");
            }
            // 每行输出完,在换行
            System.out.println("");

        }
    }

    // 6. 退出
    public void exit() {
        System.out.println("请输入你的选择y/n:");
        char choice = scan.next().charAt(0);
        if(choice == 'y'){
            System.out.println("推出~");
            flag = false;
        }
        else if(choice == 'n'){
            return;
        }
        else{
            System.out.println("输入有误,请重新输入");
        }
    }
}
