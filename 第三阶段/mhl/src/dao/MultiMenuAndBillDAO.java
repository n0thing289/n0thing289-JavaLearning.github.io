package dao;

import domain.MultiMenuAndBill;
import org.junit.Test;

import java.util.List;

public class MultiMenuAndBillDAO extends BasicDAO<MultiMenuAndBill>{
    @Test
    public void change(){
        String sql = "select * from multimenuandbill where diningTableId = ?;";
        List<MultiMenuAndBill> multiMenuAndBills = super.queryMultiply(sql, MultiMenuAndBill.class,1);
        for (MultiMenuAndBill multiMenuAndBill :
                multiMenuAndBills) {
            System.out.println(multiMenuAndBill);
        }

    }
}
