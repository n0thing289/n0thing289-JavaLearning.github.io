import java.util.Scanner;
public class BreakExercise {

	public static void main(String[] args) {
		// µÚÒ»Ìâ
		int i = 1 ;
		for(int j = 0;j <=100;j++) {
			i +=j;
			System.out.println(i);
			if (i>=20) {
				System.out.println("Finish,the sum is 20.");
				break;
			}
		}

		
		

	}
}