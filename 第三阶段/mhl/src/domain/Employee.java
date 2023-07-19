package domain;
/**
 *  id int primary key auto_increment, #自增
 * 	empno varchar(32) not null default '',#员工号
 * 	emppwd char(32) not null default '',#密码md5
 * 	`name` varchar(32) not null default '',#姓名
 * 	job varchar(32) not null default '' #岗位
 * */
public class Employee {
    private Integer id;//防止空异常
    private String empno;
    private String emppwd;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(Integer id, String empno, String emppwd, String name, String job) {
        this.id = id;
        this.empno = empno;
        this.emppwd = emppwd;
        this.name = name;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEmppwd() {
        return emppwd;
    }

    public void setEmppwd(String emppwd) {
        this.emppwd = emppwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", emppwd='" + emppwd + '\'' +
                '}';
    }
}
