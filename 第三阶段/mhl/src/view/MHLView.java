package view;

import domain.*;
import service.BillService;
import service.DiningTableService;
import service.EmployeeService;
import service.MenuService;
import utils.Utility;

import java.util.*;

/**
 * 这是主界面
 */
public class MHLView {
    private boolean loop = true;
    private String key = null;
    private EmployeeService employeeService = new EmployeeService();
    private DiningTableService diningTableService = new DiningTableService();
    private MenuService menuService = new MenuService();
    private BillService billService = new BillService();

    public  void mainView() {
        while (loop) {
            System.out.println("============满汉楼============");
            System.out.println("\t\t1. 登录满汉楼\n" +
                    "\t\t2. 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("请输入员工号: ");
                    String empno = Utility.readString(10);
                    System.out.print("请输入密  码: ");
                    String emppwd = Utility.readString(10);
                    Employee employee = employeeService.getEmployeeByempnoAndemppwd(empno, emppwd);
                    //TODO 到数据库去判断
                    if (employee != null) {
                        System.out.println("登录成功 " + employee.getName());
                        secondaryView();
                    } else {
                        System.out.println("登录失败");
                    }
                    break;
                case "2":
                    loop = false;
                    System.out.println("退出mhl");
            }
        }

    }

    public void secondaryView(){
        // 显示二级菜单
        while (loop) {
            System.out.println("============满汉楼二级菜单============");
            System.out.println(
                    "\t\t1 显示餐桌状态\n" +
                            "\t\t2 预定餐桌\n" +
                            "\t\t3 显示所有菜品\n" +
                            "\t\t4 点餐服务\n" +
                            "\t\t5 查看账单\n" +
                            "\t\t6 结账\n" +
                            "\t\t9 推出满汉楼\n"
            );
            System.out.print("请输入你的选择: ");
            String key = Utility.readString(1);
            switch (key){
                case "1":
                    showDiningTableState();
                    break;
                case "2":
                    bookingDiningTable();
                    break;
                case "3":
                    showAllMenus();
                    break;
                case "4":
                    order();
                    break;
                case "5":
                    showBill(1);
                    break;
                case "6":
                    checkUp();
                    break;
                case "9":
                    System.out.println("推出满汉楼");
                    loop = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new MHLView().mainView();
    }

    //界面层封装 显示餐桌状态功能
    public void showDiningTableState(){
        List<DiningTable> diningTableList = diningTableService.getDiningTableList();
        System.out.println("餐桌编号: " + "\t\t餐桌状态:");
        for (DiningTable diningtable:
                diningTableList) {
            System.out.println(diningtable.getId() + "\t\t\t\t" + diningtable.getState());
        }
    }
    //界面层封装 预定餐桌功能
    public void bookingDiningTable(){
        System.out.println("==========预定餐桌==========");
        System.out.print("请选择要预定餐桌编号(-1退出): ");
        int tableId = Utility.readInt();
        if(tableId == -1){
            return;
        }
        System.out.print("确认是否预定(Y/N): ");
        if(!Utility.readString(1).equals("y")){
            return;
        }
        if(!diningTableService.checkTableState(tableId)){
            System.out.println("该桌已经处于'已经预定'或者'就餐状态'");
            return;
        }
        System.out.print("预定人名字: ");
        String orderName = Utility.readString(32);
        System.out.print("预定人电话: ");
        String orderTel = Utility.readString(32);
        if(!diningTableService.bookingTable(tableId,orderName,orderTel)){
            System.out.println("预定失败,预定程序可能出现异常");
        }
        System.out.println("==========预定成功==========");
    }
    //界面层封装 显示所有菜品功能
    public void showAllMenus(){
        System.out.println("显示所有菜品");
        List<Menu> allMenus = menuService.getAllMenus();
        System.out.println("菜品编号\t\t菜品名\t\t\t类别\t\t\t\t价格");
        for (Menu menu:
                allMenus) {
            System.out.println(menu.getId() +"\t\t\t"+ menu.getName() +"\t\t\t"+ menu.getType() +"\t\t\t"+ menu.getPrice());
        }
    }

    //界面层封装 点餐功能
    public void order(){
        System.out.println("点餐服务");
        System.out.print("选择餐桌(-1退出): ");
        int diningTableId = Utility.readInt();
        //如果是被预定(日后这里要完善,即使预定只需要核对一下当前的人是否是预定人即可)以及就餐中是不能选择的,
        DiningTable diningTableById = diningTableService.getDiningTableById(diningTableId);
        if(diningTableById == null){
            System.out.println("请重新选择餐桌, 当前餐桌不存在或者非空");
            return;
        }
//        if(!"空".equals(diningTableById.getState())
//                || !"就餐中".equals(diningTableById.getState())){
//            System.out.println("请重新选择餐桌, 当前餐桌不存在或者非空");
//            return;
//        }
        //else if(!"预定人".equals(diningTableById.getOrderName())){continue;}
        System.out.println("===点菜中=== ");
        String[] menus = new String[10];
        int i = 0;//i就是菜品种类数
        while (true){
            System.out.print("输入菜品编号(-1结束点餐): ");
            String foodId = Utility.readString(50);
            if("-1".equals(foodId)){
                break;
            }
            if(menuService.getMenuById(Integer.parseInt(foodId)) == null){
                System.out.println("不存在这道菜,请重新输入菜品编号!");
                continue;
            }
            menus[i] = foodId;
            i++;
        }
        String[] nums = new String[10];
        int j = 0;
        while(j<i){
            System.out.print("输入第"+(j+1)+"道菜品的数量: ");
            String num = Utility.readString(50);
            nums[j] = num;
            j++;
        }

        //算总金额
        StringBuilder menusStr = new StringBuilder();
        StringBuilder numsStr = new StringBuilder();
        double sum = 0;
        for (int index = 0;index<i;index++){
            menusStr.append(menus[index]).append(" ");
            numsStr.append(nums[index]).append(" ");
            double foodPrice = menuService.getPriceByMenuId(Integer.parseInt(menus[index]));
            sum += foodPrice * Integer.parseInt(nums[index]);
        }
        System.out.println("sum: " + sum);
        System.out.println(menusStr);
        System.out.println(numsStr);
        if(billService.orderMenu(menusStr.toString(), numsStr.toString(), sum, diningTableId)){
            System.out.println("已记账");
            diningTableService.updateState(diningTableId, "就餐中");
        }
    }

    //界面层封装 查看账单
    public void showBill(){
        System.out.println("查看菜单");
        System.out.print("输入餐桌号：");
        int diningTableId = Utility.readInt();
        List<Bill> bills = billService.getBillsByDiningTableId(diningTableId);
        for (Bill bill:bills){
            if(!"未结账".equals(bill.getState())){
                continue;
            }
            System.out.println(bill);
        }


    }

    public void checkUp(){
        System.out.println("结账");
        System.out.println("请选择要结账的餐桌编号(-1退出): ");
        int diningTableId = Utility.readInt();
        if(diningTableId == -1){
            return;
        }
        DiningTable diningTable = diningTableService.getDiningTableById(diningTableId);
        if(diningTable == null){
            System.out.println("此餐桌不存在");
            return;
        }
        List<Bill> bills = billService.getBillsByDiningTableId(diningTableId);
        double sum = 0;
        for (Bill bill:bills){
            if(!"未结账".equals(bill.getState())){
                continue;
            }
            sum += bill.getMoney();
        }
        if(sum == 0){
            System.out.println("该餐桌没有未结账菜单");
            return;
        }
        System.out.println("结账的方式(现金/支付宝/微信)回车表示退出: ");
        String way = Utility.readString(3);
        System.out.println("确认是否结账(Y/N): ");
        if("n".equals(Utility.readString(1))){
            System.out.println("结账不成功");
            return;
        }

        System.out.println("需要支付: " + sum + "元");
        System.out.print("输入数字交钱: ");
        double money = Double.parseDouble(Utility.readString(32));
        if (money != sum){
            System.out.println("支付存在问题,可能收钱少了");
        }
        //收钱成功,修改餐桌状态和账单的状态
        if(diningTableService.updateState(diningTableId, "空")
                && billService.updateState(diningTableId, way, "未结账") > 0){
            System.out.println("结账成功");
        }
    }

    public void showBill(int version){
        /**
         * 第一步，去重并且得到去重后的名称和对应数量，用hashmap关联
         * 第二步，输出
         * */
        System.out.println("查看菜单");
        System.out.print("输入餐桌号：");
        int diningTableId = Utility.readInt();
        List<Bill> bills = billService.getBillsByDiningTableId(diningTableId);

        for (Bill bill:bills){
            String oldMenuIds = bill.getMenuIds();
            String[] oldMenuIdsSplit = oldMenuIds.split(" ");
            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
            HashSet<String> newMenuIdsSet = new HashSet<>();//用来判断加入的是否为重复（做标志）
            StringBuilder menuIds = new StringBuilder();//为了输出菜品号
            int nextInt = 0;
            for (int i = 0; i < oldMenuIdsSplit.length; i++) {//===strings.addAll(Arrays.asList(oldMenuIdsSplit));
                nextInt = Integer.parseInt(oldMenuIdsSplit[i]);
                String name = menuService.getMenuById(nextInt).getName();
                if(newMenuIdsSet.add(name)){
                    stringIntegerHashMap.put(name,1);
                    menuIds.append(nextInt).append(" ");
                }else{
                    int oldValue = stringIntegerHashMap.get(name);
                    stringIntegerHashMap.replace(name, ++oldValue);
                }
            }
//            System.out.println(stringIntegerHashMap);//测试hashmap
            //
            System.out.println("===历史账单===");
            System.out.print("编号: ");
            System.out.println(bill.getId());

            System.out.print("菜品号: ");
            System.out.println(menuIds);

            System.out.print("金额: ");
            System.out.println(bill.getMoney());

            System.out.print("桌号: ");
            System.out.println(bill.getDiningTableId());

            System.out.print("状态: ");
            System.out.println(bill.getState());

            Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
            System.out.print("菜品明细: ");
            for (Map.Entry<String, Integer> entry: entries){
                System.out.print(entry.getKey() + "x" + entry.getValue());
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    /**
     * 多表细节
     * 1. 增加字段
     * 2. 多表的domain，字段越来越多怎么办，进行一个拆分或者把一个bean作为另一个bean的属性，
     * 3. 多表映射的domain可以不用有参构造器，反射还是会通过set，来设置属性
     * 4. 属性名是否一定要和表的列名保持一致 -》 通过列名找setXxx() -》 会出问题，必须对应 --sql语句起别名就行
     * */
    //TODO 登录管理，人事管理


}
