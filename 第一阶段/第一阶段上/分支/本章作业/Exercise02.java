import java.util.Scanner;
public class Exercise02 {

	public static void main(String[] args) {
		//ʵ����Scanner
		//����һ����������
		//whileѭ����if�жϷ�Χ
		//��ȡ�û��������Ƴ�
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("������һ������");
		char flag = 'a';
		while(flag != 'q'){
			int var = my_scanner.nextInt();
			int int_var = (0-var);
			if(int_var < 0){
				System.out.println("����0");
			}
			else if(int_var > 0){
				System.out.println("С��0");
			}
			else{
				System.out.println("0");
			}
			System.out.println("continue��quit=q");
			flag = my_scanner.next().charAt(0);
		}
	}
}