package service;

import dao.BillDAO;
import domain.Bill;

import java.util.List;
import java.util.UUID;

public class BillService {
    private BillDAO billDAO = new BillDAO();

    /*
    1. 选择餐桌
    2. 收集菜品编号和数量(数组)
    3. 计算总金额(查Menu表拿到单价,写方法)
    4. 发送回数据库

    id INT PRIMARY KEY AUTO_INCREMENT, #自增主键
 * 	billId VARCHAR(50) NOT NULL DEFAULT '',#账单号可以按照自己规则生成 UUID
 * 	menuIds VARCHAR(50) NOT NULL DEFAULT '',#菜品的编号集合, 也可以使用外键
 * 	nums VARCHAR(50) NOT NULL DEFAULT '',#份数集合
 * 	money DOUBLE NOT NULL DEFAULT 0, #总金额
 * 	diningTableId INT NOT NULL DEFAULT 0, #餐桌
 * 	billDate DATETIME NOT NULL ,#订单日期
 * 	state VARCHAR(50) NOT NULL DEFAULT '' # 状态 '未结账' , '已经结账', '挂单'
     */

    public boolean orderMenu(String menuIds, String numSet, double money, int diningTableId){
        //生成一个账单号
        String billId = UUID.randomUUID().toString();
        String sql = "insert into bill values(null,?, ?,?,?,?,NOW(), '未结账')";
        int i = billDAO.update(sql, billId,menuIds, numSet, money, diningTableId);
        return i == 1;
    }

    public Bill getBillByDiningTableId(int diningTableId){
        String sql = "select * from bill where diningTableId = ?;";
        Bill bill = billDAO.querySingle(sql, Bill.class, diningTableId);
        return bill;
    }
    public List<Bill> getBillsByDiningTableId(int diningTableId){
        String sql = "select * from bill where diningTableId = ?;";
        List<Bill> bills = billDAO.queryMultiply(sql, Bill.class, diningTableId);
        return bills;
    }

    public int updateState(int diningTableId, String way, String originalState){
        List<Bill> bills = getBillsByDiningTableId(diningTableId);

        String sql = "update bill set state = ? where diningTableId = ? and state = ?;";
        int affectedRows = billDAO.update(sql, way, diningTableId, originalState);
        return affectedRows;
    }
}
