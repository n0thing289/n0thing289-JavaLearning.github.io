public class Exercise09 {

	public static void main(String[] args) {
		//˼·����
		//ÿһ���ڶ����ǰ����ۼӼ��ϵ�ǰ�Ĵ�����ʵ�ֵ�
		//����һ�����������ۼ�
		//�ٶ���һ���������ڸ��ۼӵı������
		int i = 0;
		int j = 0;
		int sum = 0;
		while(j<=99){
			while(true){
				++i;
				i += j;
				j++;
				break;
			}
			sum += i;
		}
		System.out.println(sum);//5050
	}
}