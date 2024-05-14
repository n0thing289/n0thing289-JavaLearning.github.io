public class Homework03 {
	public static void main(String[] args) {

		//保存两本书，并输出
		String s1 = "python-从入门到实践";
		String s2 = "java语言程序设计";

		System.out.println("我买了两本书：" + s1 + '\t' +s2);//只要有一方是字符串就做拼接运算

		//保存性别，并输出
		char gender1 = '男';
		char gender2 = '女';

		System.out.println("男女有别:" + gender1 + '\t' + gender2);//注意char在运算时，是先运算各自码值，最终的码值对应的字符再输出
		//但是但是但是，我这里有字符串，一方有字符串那么做拼接！！！
		//输出男女有别:男     女

		//保存两本书价格，并输出
		int price_s1 = 100;
		int price_s2 = 108;

		System.out.println("两本书的价格：" + price_s1 + '\t' + price_s2);


	}
}