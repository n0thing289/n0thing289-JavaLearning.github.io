//package 分支;
/*
 * 定义两个变量int，判断二者的和是否能被3又能被5整除，打印提示信息
 *0108——双分支练习
 */
public class IfExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//思路分析
		//1.丁一两个变量int 
		
		//
		//
		//
		//
		//
		//
		double var1 = 3;
		double var2 = 3;
		double sum = var1 + var2;
		double flag1 = sum % 3.0;
		double flag2 = sum % 5.0;
		
		if (flag1 == 0 && flag2 == 0) {
			System.out.println("可以被3或者5整除");
		}
		else {
			System.out.println("不能被3或者5整除");
		}
		
		// if (flag2 == 0) {
		// 	System.out.println("可以被五整除");
		// }
		// else {
		// 	System.out.println("不能被五整除");
		// }
	}

}
