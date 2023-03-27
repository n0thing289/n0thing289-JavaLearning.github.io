import java.util.Scanner;
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        while(true){
            System.out.print("请输入一个整数:");
            String input = scanner.next();
            try{
                i = Integer.parseInt(input);

                break;
            }catch(Exception e){
                System.out.println("你输入的不对请重新输入");
            }
        }

        System.out.println("输入成功");
        System.out.println("你输入的是:" + i);


    }
}


