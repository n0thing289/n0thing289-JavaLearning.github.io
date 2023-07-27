package domain;

public class MultiMenuAndBill {
    private Integer billId;
    private Integer menuId;
    private String menuIds;
    private String numSet;
    private Double money;
    private Integer diningTableId;
    private String state;

    public MultiMenuAndBill() {
    }

    public MultiMenuAndBill(Integer billId, Integer menuId, String menuSet, String numSet, Double money, Integer diningTableId, String state) {
        this.billId = billId;
        this.menuId = menuId;
        this.menuIds = menuSet;
        this.numSet = numSet;
        this.money = money;
        this.diningTableId = diningTableId;
        this.state = state;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MultiMenuAndBill{" +
                "billId=" + billId +
                ", menuId=" + menuId +
                ", menuSet='" + menuIds + '\'' +
                ", numSet='" + numSet + '\'' +
                ", money=" + money +
                ", diningTableId=" + diningTableId +
                ", state='" + state + '\'' +
                '}';
    }
}
