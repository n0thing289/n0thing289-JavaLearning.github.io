import java.util.Scanner;
public class review_houzichitao{
	public static void main(String[] args){
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("enter a day number");
		int day = my_scanner.nextInt();

		Houzi my_houzi = new Houzi();

		int peach_num = my_houzi.peach(day);
		System.out.println("peach_num= " + peach_num);
	}
}


class Houzi{
	public int peach(int n){
		// 思路分析：，老韩的思路是先用逆推的方法去推出987天对应的桃子，
		// 并且得到一个前天后后天桃子数目的关系式
		// 第十天    1个桃子（1= 九/2 - 1）
		// 第九天    （1 + 1）* 2 = 4 （4= 八/2 - 1）
		// 第八天    （4 + 1）* 2 = 10
		// .
		// .
		// .
		// 可以得到，（后一天的桃子数+1）*2 = 前一天的桃子数
		if(n>=1 && n <= 10){
			if(n == 10){
				return 1;
			}
			else{
				return (peach(n+1)+1)*2;
			}
		}
		else{
			System.out.println("error! please try again!!!");
			return -1;
		}
	}
}