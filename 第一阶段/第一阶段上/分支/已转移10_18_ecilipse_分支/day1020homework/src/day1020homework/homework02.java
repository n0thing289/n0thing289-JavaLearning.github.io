package day1020homework;
import java.util.Scanner;
public class homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("Enter an integer for seconds:");
		int seconds = my_scanner.nextInt();
		int minutes = seconds /60;
		int yu_shu_miaoshu = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + yu_shu_miaoshu + " seconds.");
	}

}
