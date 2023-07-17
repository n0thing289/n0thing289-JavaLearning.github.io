package dao_.test;

import dao_.dao.GoodsDAO;
import dao_.domain.Goods;
import org.junit.Test;

import java.util.List;

public class testGoodsDAO {
    @Test
    public void test(){
        GoodsDAO goodsDAO = new GoodsDAO();
        //1. 查询多行
        List<Goods> goods = goodsDAO.queryMultiply("select * from goods where id >= ?", Goods.class, 10);
        for (Goods good:
             goods) {
            System.out.println(good);
        }

        //2. 查询单行
        Goods good_70 = goodsDAO.querySingle("select * from goods where id = ?", Goods.class, 70);
        System.out.println("查询单行: " + good_70);

        //3. 查询单行单列
        Object good_20 = goodsDAO.queryScalar("select goods_name from goods where id = ?", 20);
        System.out.println("查询单行单列: " + good_20);

        //4. dml
//        int update = goodsDAO.update("insert into goods values(90, 'honor', 2500);");
        int update = goodsDAO.update("delete from goods where goods_name = 'honor';");
        System.out.println(update>0?"affected":"unaffected");
        System.out.println(update);

    }
}
