//package ��֧;
//0108����˫��֧��ϰ��
public class IfExercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		if (year % 4.0 == 0 && year % 100.0 != 0) { // ע������ʱ��С����ϸ��
			System.out.println("��һ������ͨ��������һ������");
		} else {
			System.out.println("��һ��������ͨ�����ⲻ������");
		}
		
		if (year % 400.0 == 0) {
			System.out.println("�ڶ�������ͨ��������һ������");
		} else {
			System.out.println("�ڶ���������ͨ�����ⲻ������");
		}
		
		System.out.println("\n" + "\n" + "������Ĵ��룺");
		if ((year % 4.0 == 0 && year % 100.0 != 0) || (year % 400.0 == 0)) {
			System.out.println("ͬʱ�ж���������ͨ��������һ������");
		}
	}

}
