package encapExercise;
//import encapExercise.Account;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("蔡徐坤");
        account1.setPassword("520520");
        account1.setMoney(5201314);
        System.out.println(account1.info());

        Account account2 = new Account("小黑子", "520520", 1433223);//idea自带的参数提示
        System.out.println(account2.info());
    }
}
