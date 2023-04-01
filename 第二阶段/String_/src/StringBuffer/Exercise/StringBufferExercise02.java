package StringBuffer.Exercise;

import java.util.Scanner;

public class StringBufferExercise02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static StringBuffer  getMoney(Scanner scanner){
//        Scanner scanner = new Scanner(System.in);

        System.out.println("输入价格:");
        String money = scanner.next();
        StringBuffer moneysb = new StringBuffer(money);

        //定义一个加点的控制变量
        //1234567 -> 12,345.67
        int point = 0;
        int firstPoint = moneysb.indexOf(".");
        System.out.println(moneysb.lastIndexOf("."));
        for(int i = moneysb.length() - 1;i>=0;i--){
            point++;
            if(point == 2 && firstPoint == -1){
                moneysb.insert(i,'.');
                point = 0;
                firstPoint = 0;

            }else if(firstPoint == 0){
                if(point == 3 && moneysb.lastIndexOf(".") != 2){
                    moneysb.insert(i,',');
                    point = 0;
                }
            }

        }
//        System.out.println(moneysb);
        return moneysb;
    }
    public static void main(String[] args) {
        System.out.println(getMoney(scanner));
    }


    public static StringBuffer NEWgetMoney(){
        String price = "8123564.59";
        StringBuffer sb = new StringBuffer(price);

        for(int i =sb.lastIndexOf(".")-3;i>0;i -= 3){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
        return sb;
    }
}
