package jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Druid_ {
    public static void main(String[] args) throws Exception {


    }
    @Test
    public void druid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("ok: " + (end - start));
    }


}
