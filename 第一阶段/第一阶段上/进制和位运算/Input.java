import java.util.Scanner;//表示把java.util包下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		//演示接受用户的输入
		//步骤
		//Scanner类 表示 简单文本扫描器，在java。util包
		//1导包（引入一个类就需要先引入类所在的包 ）
		//2创建Scanner对象，new 创建一个对象
		

		Scanner my_scanner = new Scanner(System.in);
		//3.接受用户的输入
		System.out.println("enter a name:");
		String name = my_scanner.next();

		System.out.println("enter a age:");
		int age = my_scanner.nextInt();

		System.out.println("enter a salary:");
		double salary = my_scanner.nextDouble();

		System.out.println("your informations:" + "\nname " + name + "\nage " + age + "\nsalary " + salary);

		
	}
} 