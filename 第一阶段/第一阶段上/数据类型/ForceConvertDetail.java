public class ForceConvertDetail {
	public static void main(String[] args) {

		//��ʾǿ������ת��
		//ǿת����ֻ��Ծͽ��Ĳ�������Ч��������С�����������ȼ�
		//int x = (int)10*3.5 + 6*1.5;//����1.5Ĭ����double����Ҳ�Ǳ��ʽ�о�����ߵ����ͣ����Զ������ʽ���תΪ��߾��ȵ�double���͡�

		int y = (int)(10*3.5 + 6*1.5);//��int��44.0 --�� 44
		System.out.println(y);//44



		char c1 = 100;
		int m = 100;
		//char c2 = m;
		char c3 = (char)m;
		System.out.println(c3);
	}
}