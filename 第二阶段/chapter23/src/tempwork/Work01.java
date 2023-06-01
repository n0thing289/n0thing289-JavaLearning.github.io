package tempwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. 注册");
            System.out.println("2. 登录");
            int flag = scanner.nextInt();
            if(flag == 1){
                Register.signUp();
                System.out.println("注册成功");
                System.out.println(Register.getDb());
            } else if (flag == 2) {
                Register.verify();
                Goods goods = new Goods();
                goods.show();
                goods.change();
            }
        }
    }
}
class Register{
    private static HashMap<String, User> db = new HashMap<>();

    private static final Scanner scan = new Scanner(System.in);
    public static void signUp(){
        boolean b = true;
        while(b){

            System.out.println("*****欢迎进入注册系统()*****");

            System.out.print("请输入用户名：");
            String userId = scan.next();
            userId = userId.length() > 3 ? userId : null;
            if (userId == null){
                System.out.println("用户名长度不小于3");
                continue;
            }

            System.out.print("请输入密码：");
            String userPassword1 = scan.next();
            userPassword1 = userPassword1.length() > 6 ? userPassword1 : null;
            if(userPassword1 == null){
                System.out.println("用户密码不小于6");
                continue;
            }

            System.out.print("请再次输入密码：");
            String userPassword2 = scan.next();
            userPassword2 = userPassword2.length() > 6 ? userPassword2 : null;
            if(userPassword2 == null){
                System.out.println("用户密码不小于6");
                continue;
            }

            System.out.print("请输入身份证：");
            String id = scan.next();
            id = (id.length() <= 18) ? id :null;
            if (id==null){
                System.out.println("身份证必须16位或18位");
                continue;
            }

            System.out.print("请输入电话号码：");
            String phone = scan.next();
            phone = phone.length() == 11 ? phone :null;
            if(phone == null){
                System.out.println("手机号必须11位");
                continue;
            }
            System.out.println("请输入座机号");
            String zuoji = scan.next();
            String[] split = zuoji.split("-");
            if(!(split[0].length() == 4 && split[1].length() == 7)){
                System.out.println("座机区号必须是4位，号码7位");
                continue;
            }
            String userPassword = userPassword1.equals(userPassword2) ? userPassword1 : null;
            if (userPassword != null){
                User user = new User(userId, userPassword, id, phone, zuoji);
                db.put(userId, user);
                b = false;
            }
        }



    }
    public static void verify(){
        System.out.println("====登录系统=====");
        System.out.print("请输入用户名：");
        String userId = scan.next();

        System.out.print("请再次输入密码：");
        String userPassword = scan.next();

        User user = db.get(userId);
        if(userId.equals(user.getUserId()) && userPassword.equals(user.getPassword())){
            System.out.println("登录成功");
        }
    }

    public static HashMap<String, User> getDb() {
        return db;
    }

    public static void setDb(HashMap<String, User> db) {
        Register.db = db;
    }
}
class User{
    private String userId;

    private String password;
    private String ID;
    private String phoneNumber;
    private String zuojiNumber;
    public User() {
    }

    public User(String userId, String password, String ID, String phoneNumber, String zuojiNumber) {
        this.userId = userId;
        this.password = password;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.zuojiNumber = zuojiNumber;
    }

    public User(String userId, String password, String ID, String phoneNumber) {
        this.userId = userId;
        this.password = password;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZuojiNumber() {
        return zuojiNumber;
    }

    public void setZuojiNumber(String zuojiNumber) {
        this.zuojiNumber = zuojiNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", ID='" + ID + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zuojiNumber='" + zuojiNumber + '\'' +
                '}';
    }
}

class Goods{
    private String name[] = {"电风扇", "洗衣机","电视机", "冰 箱", "空调机"};
    private double price[] = {124.23, 4500.0,8800.9,5000.88,4456.0};
//    private String goods[] = {
//            "1\t\t\t电风扇\t\t\t124.23",
//            "2\t\t\t洗衣机\t\t\t4,500",
//            "3\t\t\t电视机\t\t\t8,800",
//            "4\t\t\t冰 箱\t\t\t5,000",
//            "5\t\t\t空调机\t\t\t4,456",
//    }
    public void show() {
        System.out.println(
                "**********欢迎进入商品批发城*********");
        for (int i = 0; i < 5; i++) {
            String tempPrice = String.valueOf(price[i]);
            int dotIndex = tempPrice.indexOf(".");
            int willInsertDotIndex = dotIndex -3;
            char[] chars = tempPrice.toCharArray();
            try{
                char aChar = chars[willInsertDotIndex-1];
                StringBuilder stringBuffer = new StringBuilder(Arrays.toString(chars));
                stringBuffer.insert(willInsertDotIndex+1, ",");
                String finPrice = stringBuffer.toString();
                System.out.println(
                        (i+1) +"\t\t\t"+ name[i] + "\t\t\t"+ finPrice
                );
            }catch (Exception e){
                System.out.println(
                        (i+1) +"\t\t\t"+ name[i] + "\t\t\t"+ price[i]
                );
                continue;
            }


        }

    }
    public void change(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您批发的商品编号：");
        int index = scanner.nextInt();

        double goodPrice = price[index-1];
        System.out.print("请输入批发数量：");
        double num = scanner.nextInt();
        System.out.printf("您需要付款：%f", (goodPrice * num));
    }
}