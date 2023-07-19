package view;

import domain.DiningTable;
import domain.Employee;
import service.DiningTableService;
import service.EmployeeService;
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
                    System.out.println("显示所有菜品");break;
                case "4":
                    System.out.println("点餐服务");break;
                case "5":
                    System.out.println("查看菜单");break;
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
}
