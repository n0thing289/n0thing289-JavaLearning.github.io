import java.util.Scanner;
public class IF01 {
	public static void main(String[] args){
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄêÁä");

		int age = my_scanner.nextInt();

		if (age > 18) {
			System.out.println("you are over 18,fbi open the door!");

		}
		else {
			System.out.println("you are beneath 18,good boy");
		}
	}
}