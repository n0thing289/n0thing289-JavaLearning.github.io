public class Exercise06 {

	public static void main(String[] args) {
		//˼·����
		//����һ����������forѭ�����ϼ�һ��
		//ĳһ���ж�ģ5��0���Ƿ������
		//����һ���������ڼ�¼�м����Ǳ������ģ��������5�����������һ��
		int beiwuzhengchushu = 0;
		for(int i = 1;i<=100;i++){

			if(i % 5.0 != 0){
				beiwuzhengchushu++;
				System.out.print(i + " ���ܱ������� ");
				if(beiwuzhengchushu % 5 == 0){
					System.out.println("\t\t");
				}
			}
		}
	}
}