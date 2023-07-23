package view;

import domain.Bill;
import domain.DiningTable;
import domain.Employee;
import domain.Menu;
import service.BillService;
import service.DiningTableService;
import service.EmployeeService;
import service.MenuService;
import utils.Utility;

import java.util.List;

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
                            "\t\t5 查看菜单\n" +
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
                    System.out.println("查看菜单");
                    System.out.print("输入餐桌号：");
                    int diningTableId = Utility.readInt();
                    Bill billByDiningTableId = billService.getBillByDiningTableId(diningTableId);
                    System.out.println(billByDiningTableId);
                    break;
                case "6":
                    System.out.println("结账");break;
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
        if(diningTableById == null && !"空".equals(diningTableById.getState())){
            System.out.println("请重新选择餐桌, 当前餐桌不存在或者非空");
            return;
        }
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
            diningTableService.updateDiningTable(diningTableId, "就餐中");
        }
    }


}
