public class ArithmeticOperatorExercise02 {

	public static void main(String[] args) {
		/*
		1.��������
		2.˼·����
		3.�ߴ���
		 */
		//1���뻹��59��ż٣��ʣ���xx��������xx��
		int all_day = 59;
		int one_week = 7;
		int week = all_day / one_week;
		int day = all_day % one_week;
		System.out.println("�� " + week + 
			" �������� " + day + " ��");

		//2����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��5/9*�������¶�-100����
		//����������¶ȶ�Ӧ�������¶ȡ���234.5��
		double huashiwendu = 234.5;
		double sheshiwendu = 5.0 / 9.0 * (huashiwendu - 100);
		//ע�⣡5.0/9.0����Ҫ��С���������Զ�����ת������
		//����ֵ�������ӱ��ʽ����������ң�Ϊһ���ӱ��ʽ��ʱ
		//�����Զ����ӱ��ʽ����������ӱ��ʽ�������о�����ߵ����ͣ���Ҳ������huashiwendu�Ѿ����������ʽ�����������������ˣ�ȱ�����޷��õ����յĽ����
		//5/9ʱ�������һ��0.����С�������һ���int���ͣ����Է���0��0���κ�����Ϊ��
		//
		System.out.println( "�����¶�[" + huashiwendu + "]��Ӧ�������¶�Ϊ" + sheshiwendu + "��");

	}
}