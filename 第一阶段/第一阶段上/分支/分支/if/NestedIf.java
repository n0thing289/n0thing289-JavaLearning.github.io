import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);

		System.out.println("enter the gamer`s score:");
		double score = my_scanner.nextDouble();
		
		//System.out.println("enter the gamer`s gender:")
		//char gender = my_scanner.next().charAt(0);

		if (score > 8.0) {
			System.out.println("恭喜你进入决赛");
			System.out.println("enter the gamer`s gender:");
		    char gender = my_scanner.next().charAt(0);//charAt() 字符串转字符
			if(gender == '男') {
				System.out.println("进入男子组");
			}
			else if (gender == '女') {
				System.out.println("进入女子组");
			}
			else {
				System.out.println("性别有误");
			}
		}
		else {
			System.out.println("I`m afraid to say you didn`t join juesai");
		}

	}
}