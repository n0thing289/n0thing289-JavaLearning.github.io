package jdbc.datasource;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;

public class ConQuestion {
    //连接5000次,看会出现什么问题
    @Test
    public void testCon(){
        for (int i = 0; i < 5000; i++) {
            Connection connect = JDBCUtils.getConnect();//"too mary connections"

            // 如果连接后我就关闭呢
            JDBCUtils.close(null,null,connect);
        }
        /**
         * 问题就是现在有大量的连接需要访问数据库, 而且需要连接关闭的耗时减少
         * */
    }

}
