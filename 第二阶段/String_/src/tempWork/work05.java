package tempWork;

public class work05 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i == 1|| i==2){
                System.out.println(i);
                continue;
            }
            for(int j =2;j<i;j++){
                if(i % j ==0){
                    break;
                }
                if(j == i-1){
                    System.out.println(i);
                }
            }

        }
    }
}
//5.输出100以内的所有素数。


/**
 *     int x = 5;
 *         //素数列表
 *         int[] suShu = new int[100];
 *         for(int j = 1;j<=100;j++){
 *             //假定5是素数,那么在1-100内如果出现某个数除以5等于0,就说明5不是素数
 *             x = j;
 *             for(int i=1;i<=100;i++){
 *
 * //                if(i == x){//
 * //                    return;
 * //                }
 *                 if(i % x == 0){
 *                     System.out.println("不是素数");
 *
 *                 }
 *             }
 *
 *         }
 *
 *
 *         //show
 *         for(int i = 0;i< suShu.length;i++){
 *             System.out.println(suShu[i]);
 *         }
 */