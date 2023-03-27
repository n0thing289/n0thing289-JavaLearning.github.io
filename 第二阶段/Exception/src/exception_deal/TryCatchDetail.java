public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "韩顺平";
            int a = Integer.parseInt(str);
            System.out.println("number:" + a);
        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
            System.out.println("异常信息：" +e.getMessage());
        }finally{
            System.out.println("finally 执行...");
        }
    }
}
