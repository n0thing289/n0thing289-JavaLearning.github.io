import java.util.Scanner;//��ʾ��java.util���µ�Scanner�ർ��
public class Input {
	public static void main(String[] args) {
		//��ʾ�����û�������
		//����
		//Scanner�� ��ʾ ���ı�ɨ��������java��util��
		//1����������һ�������Ҫ�����������ڵİ� ��
		//2����Scanner����new ����һ������
		

		Scanner my_scanner = new Scanner(System.in);
		//3.�����û�������
		System.out.println("enter a name:");
		String name = my_scanner.next();

		System.out.println("enter a age:");
		int age = my_scanner.nextInt();

		System.out.println("enter a salary:");
		double salary = my_scanner.nextDouble();

		System.out.println("your informations:" + "\nname " + name + "\nage " + age + "\nsalary " + salary);

		
	}
} 