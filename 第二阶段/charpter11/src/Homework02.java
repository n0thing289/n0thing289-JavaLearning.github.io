import java.util.Scanner;

public class Homework02 {
    private static final Scanner scan = new Scanner(System.in);
    private String  userName;
    private int password;
    private String e_mail;

    public void registerUserName(){
        System.out.print("用户名:");
        String username = scan.next();
        if (!(username.length() <=4 && username.length() >=2)){
            throw new RuntimeException("用户名不对, 用户名长度为2-4");
        }
        this.userName = username;
    }
    public void registerPassword(){
        System.out.print("密码:");
        String p = scan.next();
        if (!(p.length() <=6 && p.length() >=0)){
            throw new RuntimeException("超出长度");
        }
        this.password = Integer.parseInt(p);
    }
    public void registerE_mail(){
        System.out.print("输入邮箱:");
        String mail = scan.next();
        if(!(mail.indexOf("@") > 0 && mail.indexOf(".") != -1 && mail.indexOf(".") > mail.indexOf("@"))){
            throw new RuntimeException("邮箱缺少符号, 并且@不能用于开头");
        }
        this.e_mail = mail;
    }

    @Override
    public String toString() {
        return "Homework02{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("--录入信息--");
        Homework02 homework02 = new Homework02();
        try{
            homework02.registerUserName();
            homework02.registerPassword();
            homework02.registerE_mail();


            System.out.println("注册成功!");
            System.out.print(homework02.toString());
        }catch (NumberFormatException e){
            System.out.println("密码全为数字!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
