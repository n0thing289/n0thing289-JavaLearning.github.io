import java.util.Scanner;
public class ArrayReduce02 {

	public static void main(String[] args) {
		//˼·����
		//1.����ԭʼ����
		//2.�ٶ���һ����ԭʼ����С����ʱ����
		//3.��������ʱ����ʱ�����һ�����鲻ȡ��Ҳ���������������һ��
		//4.��arrָ����ʱ����
		//
		//˼·����
		//1.ʵ����scanner�����Ҷ���һ����־�������ж϶Է��Ƿ��������
		//2.������Ҫ��һ��ȥ
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner my_scanner = new Scanner(System.in);
		do{
			
			int[] arrNew = new int[arr.length-1];
			for(int i = 0;i<arrNew.length;i++){
				arrNew[i] = arr[i];
			}
			arr = arrNew;

			System.out.println("\n=====������Ľ��=====");
			for(int j = 0;j<arr.length;j++){
				System.out.println(arr[j]);
			}
			System.out.println("\ndo you wanna continue?");
			char flag = my_scanner.next().charAt(0);
			if(flag == 'n'){
				break;
			}
		}while(true);
		
	}
}