package service;

import dao.DiningTableDAO;
import domain.DiningTable;

import java.util.List;

public class DiningTableService {
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    public List<DiningTable> getDiningTableList(){
        String sql = "select * from diningTable;";
        List<DiningTable> diningTables = diningTableDAO.queryMultiply(sql, DiningTable.class);
        return diningTables;
    }

    public boolean checkTableState(int id){
        String sql = "select * from diningTable where id = ?;";
        DiningTable diningTable = diningTableDAO.querySingle(sql, DiningTable.class, id);
        return diningTable != null && diningTable.getState().equals("空");
    }

    public boolean bookingTable(int id,String orderName, String orderTel){
        String sql = "update diningTable set orderName = ?, orderTel = ?,state = ? where id = ?;";
        int affectedRow = diningTableDAO.update(sql, orderName, orderTel, "已经预定", id);
        return affectedRow == 1;
        /*老韩小技巧: 把要写的sql语句现在查询分析器中测一遍*/
    }

    public DiningTable getDiningTableById(int diningTableId){
        String sql = "select * from diningTable where id = ?;";
        DiningTable diningTable = diningTableDAO.querySingle(sql, DiningTable.class, diningTableId);
        return diningTable;
    }

    public boolean updateDiningTable(int diningTableId, String state){
        String sql = "update diningTable set state = ? where id = ?";
        int update = diningTableDAO.update(sql, state, diningTableId);
        return update==1;
    }
}
