package dao_.dao;

import jdbc.datasource.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 是其他DAO的父类
 * */
public class BasicDAO<T> {// 泛型指定具体类型
    private QueryRunner qr = new QueryRunner();

    //开发通用的dml方法，针对任意的表
    public int update(String sql, Object... parameters){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();

            int affectedRows = qr.update(connection, sql, parameters);
            return affectedRows;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //返回多个对象(即多行数据),针对任意的表
    public List<T> queryMultiply(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();

            List<T> result = qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //查询单行的方法
    public T querySingle(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();

            T result = qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //查询单行单列的方法
    public Object queryScalar(String sql, Object... parameters){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();

            Object result = qr.query(connection, sql, new ScalarHandler(), parameters);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

}
