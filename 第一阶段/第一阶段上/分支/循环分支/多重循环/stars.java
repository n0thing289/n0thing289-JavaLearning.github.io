import java.util.Scanner;
public class stars {

	public static void main(String[] args) {
		/*
		1.每层打层数对应的小星星
		 
		2.观察输出结果，得出要输出的空格的算式
		3.镂空
		4.写活
		    *       //第一层前，有4个空格
		   ***		//第二层前，有3个空格
		  *****		//第三层前，有2个空格
		 *******	//第四层前，有1个空格
		********* 	//第五层前，有0个空格输出全部
		 */
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("输入总层数：");
		//定义一个总层数变量
		int total_layyer = my_scanner.nextInt();
		for(int j = 1;j<=total_layyer;j++) {//j为当前层数
			for(int k = 1;k<=(total_layyer-j);k++){
				System.out.print(" ");
			}
			//每次打印的小星星的个数
			for(int i = 1;i<=(2*j-1);i++) {
				//要想镂空，也就是在当前层数的头和尾打印即可
				if(i==1 || i==(2*j-1) || j==total_layyer){
					System.out.print("*");
				}else{
					System.out.print(" ");

				}
				
				
			}
			System.out.println();
		}
		
	}
}