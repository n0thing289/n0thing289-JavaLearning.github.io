public class WhileExercise {

	public static void main(String[] args) {
		//����һ����������ȡģ3������������0������һ����������
		//�����õ�һ������������ֱ������100
		// ����Ϊ���������
		System.out.println("��һ��-��ϰ");
		
		int i = 1;
		double zhengshu = 0;
		while (i <= 100) {
			double receive = i % 3;//int receive = i % 3.0;
			if (receive == 0) {
				zhengshu = i;
				System.out.println(zhengshu);
			}
			i++;
		}


		//����һ�����������ı�����
		//��һ����־����ȥ�ж��Ƿ�Ϊż��
		//��������һ������������
		System.out.println("\n");
		System.out.println("\n" + "�ڶ���-�κ���ϰ");
		int a = 40;
		double oushu = 0;
		while (a <= 200) {
			double flag = a % 2;
			if (flag == 0) {
				oushu = a;
				System.out.println(oushu);
			}
			a++;
		}
	}
}