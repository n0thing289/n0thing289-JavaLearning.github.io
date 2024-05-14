public class ArithmeticOperatorExercise02 {

	public static void main(String[] args) {
		/*
		1.分析需求
		2.思路分析
		3.走代码
		 */
		//1加入还有59天放假，问：含xx个星期零xx天
		int all_day = 59;
		int one_week = 7;
		int week = all_day / one_week;
		int day = all_day % one_week;
		System.out.println("含 " + week + 
			" 个星期零 " + day + " 天");

		//2定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100），
		//请求出华氏温度对应的摄氏温度。【234.5】
		double huashiwendu = 234.5;
		double sheshiwendu = 5.0 / 9.0 * (huashiwendu - 100);
		//注意！5.0/9.0至少要有小数，更据自动类型转换机制
		//，赋值或运算子表达式（运算符左右，为一个子表达式）时
		//，会自动将子表达式结果提升至子表达式操作数中精度最高的类型（这也解释了huashiwendu已经是整个表达式操作数精度最大的数了，缺还是无法得到最终的结果）
		//5/9时，结果是一个0.几的小数，而且还是int类型，所以返回0，0乘任何数都为零
		//
		System.out.println( "华氏温度[" + huashiwendu + "]对应的摄氏温度为" + sheshiwendu + "°");

	}
}