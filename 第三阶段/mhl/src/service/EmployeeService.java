package service;

import dao.EmployeeDAO;
import domain.Employee;



public class EmployeeService {
    private static EmployeeDAO employeeDAO = new EmployeeDAO();;
    @Deprecated
    public static boolean check(String empno,String emppwd){
        //1, 准备数据库和employee表,修改配置文件
        //2, 应该接收用户输入的用户名和密码
        //3, 在数据库中查询是否还有此人

        Long count = (Long)employeeDAO.queryScalar("select count(*) from employee where empno = ? and emppwd = MD5(?);", empno, emppwd);
        return count == 1;
    }

    public Employee getEmployeeByempnoAndemppwd(String empno, String emppwd){
        return employeeDAO.querySingle("select * from employee where empno = ? and emppwd = MD5(?);",Employee.class, empno, emppwd);
    }
}

//log:表的列少咯
