//package 分支;
//0108——双分支练习题
public class IfExercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		if (year % 4.0 == 0 && year % 100.0 != 0) { // 注意运算时的小数点细节
			System.out.println("第一个条件通过，这是一个闰年");
		} else {
			System.out.println("第一个条件不通过，这不是闰年");
		}
		
		if (year % 400.0 == 0) {
			System.out.println("第二个条件通过，这是一个闰年");
		} else {
			System.out.println("第二个条件不通过，这不是闰年");
		}
		
		System.out.println("\n" + "\n" + "订正后的代码：");
		if ((year % 4.0 == 0 && year % 100.0 != 0) || (year % 400.0 == 0)) {
			System.out.println("同时判断条件条件通过，这是一个闰年");
		}
	}

}
