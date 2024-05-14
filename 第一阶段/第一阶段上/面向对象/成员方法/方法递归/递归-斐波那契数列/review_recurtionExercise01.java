import java.util.Scanner;
public class review_recurtionExercise01{
	public static void main(String[] args){
		System.out.println("welcome to test fbnq!\n");
		Test_fbnq my_fbnq = new Test_fbnq();

		Scanner my_scanner = new Scanner(System.in);
		System.out.println("enter a number!\n:");
		int n = my_scanner.nextInt();
		int res = my_fbnq.fbnq(n);
		if(res != -1){
			System.out.println("res=" + res);
		}
	}
}

class Test_fbnq{
	//1,1,2,3,5,8,13...
	public int fbnq(int n){
		if(n > 0){
			if(n == 1||n == 2){
			return 1;
			}
			else{
				return fbnq(n-1) + fbnq(n - 2);
			}
		}
		else{
			System.out.println("error!");
			return -1;
		}
		
	}
}