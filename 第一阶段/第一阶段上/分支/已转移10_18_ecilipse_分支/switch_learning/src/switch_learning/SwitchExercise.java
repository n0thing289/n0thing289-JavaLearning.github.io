package switch_learning;
import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter(a to e):");
		char small_char = input.next().charAt(0);
		
		switch (small_char) {
			case 'a':
				System.out.println('A');
				break;
			case 'b':
				System.out.println('B');
				break;
			case 'c':
				System.out.println('C');
				break;
			case 'd':
				System.out.println('D');
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");

			
		}
		
		System.out.println("\n" + "\n" + "[2]enter your scopes:");
		double scopes = input.nextDouble();
		switch (scopes) {
			case (scopes):
		}
	}

}
