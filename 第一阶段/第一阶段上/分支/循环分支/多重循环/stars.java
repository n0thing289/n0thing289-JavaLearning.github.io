import java.util.Scanner;
public class stars {

	public static void main(String[] args) {
		/*
		1.ÿ��������Ӧ��С����
		 
		2.�۲����������ó�Ҫ����Ŀո����ʽ
		3.�ο�
		4.д��
		    *       //��һ��ǰ����4���ո�
		   ***		//�ڶ���ǰ����3���ո�
		  *****		//������ǰ����2���ո�
		 *******	//���Ĳ�ǰ����1���ո�
		********* 	//�����ǰ����0���ո����ȫ��
		 */
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("�����ܲ�����");
		//����һ���ܲ�������
		int total_layyer = my_scanner.nextInt();
		for(int j = 1;j<=total_layyer;j++) {//jΪ��ǰ����
			for(int k = 1;k<=(total_layyer-j);k++){
				System.out.print(" ");
			}
			//ÿ�δ�ӡ��С���ǵĸ���
			for(int i = 1;i<=(2*j-1);i++) {
				//Ҫ���οգ�Ҳ�����ڵ�ǰ������ͷ��β��ӡ����
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