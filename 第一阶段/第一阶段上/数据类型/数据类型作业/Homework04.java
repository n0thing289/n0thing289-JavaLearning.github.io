public class Homework04 {
	public static void main(String[] args) {
		//输出表格
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n小明\t20岁\t100分\t男\t打球");
		//System.out.println("小明\t20岁\t100分\t男\t打球");
		System.out.println("=================================");

		String name = "jack";
		int age = 20;
		double score = 80.9;
		char gender = '男';
		String hobby = "打篮球";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name +'\t' + age +'\t' + score +'\t' + gender +'\t' + hobby);
	}
}