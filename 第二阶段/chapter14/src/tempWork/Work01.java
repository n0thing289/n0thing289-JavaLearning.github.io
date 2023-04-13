package tempWork;

public class Work01 {
    public static void main(String[] args) {
        isPrime(50);
    }
    public static void isPrime(int Max){
        int j;
        for (int i = 2; i <= Max; i++) { //遍历1-100的整数
            for (j = 2; j <= i - 1; j++) {  //j：被i去除
                if (i % j == 0) {     //如果能被2-到i-1中的任何一个数整除就说明不是素数
                    break;      //不用break 每一个都会输出是素数
                }
            }
            if (i == j) {
                System.out.println(i + "是素数");
            }
        }

    }
}
