package domain;

import java.util.Date;

/**
 *  id INT PRIMARY KEY AUTO_INCREMENT, #自增主键
 * 	billId VARCHAR(50) NOT NULL DEFAULT '',#账单号可以按照自己规则生成 UUID
 * 	menuIds VARCHAR(50) NOT NULL DEFAULT '',#菜品的编号集合, 也可以使用外键
 * 	nums VARCHAR(50) NOT NULL DEFAULT '',#份数集合
 * 	money DOUBLE NOT NULL DEFAULT 0, #总金额
 * 	diningTableId INT NOT NULL DEFAULT 0, #餐桌
 * 	billDate DATETIME NOT NULL ,#订单日期
 * 	state VARCHAR(50) NOT NULL DEFAULT '' # 状态 '未结账' , '已经结账', '挂单'
 * */
public class Bill {
    private Integer id;
    private String billId;
    private String menuIds;
    private String numSet;
    private Double money;
    private Integer diningTableId;
    private Date billDate;
    private String state;

    public Bill() {
    }

    public Bill(Integer id, String billId, String menuIds, String numSet, Double money, Integer diningTableId, Date billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuIds = menuIds;
        this.numSet = numSet;
        this.money = money;
        this.diningTableId = diningTableId;
        this.billDate = billDate;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }

    public String getNumSet() {
        return numSet;
    }

    public void setNumSet(String numSet) {
        this.numSet = numSet;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDiningTableId() {
        return diningTableId;
    }

    public void setDiningTableId(Integer diningTableId) {
        this.diningTableId = diningTableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billId='" + billId + '\'' +
                ", menuIds='" + menuIds + '\'' +
                ", numSet='" + numSet + '\'' +
                ", money=" + money +
                ", diningTableId=" + diningTableId +
                ", billDate=" + billDate +
                ", state='" + state + '\'' +
                '}';
    }
}
