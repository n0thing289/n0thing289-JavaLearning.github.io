public class MethodParameter01 {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA aa = new AA();
		aa.swap(a, b);
		System.out.println("main�� a = " + a + " b = " + b);//a=10.b=20
	}
}


class AA{
	public void swap(int a,int b){
		System.out.println("swap֮ǰ a = " + a + " b = " + b);//a=10.b=20
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap֮�� a = " + a + " b = " + b);//a=20,b=10
	}
}

/*
	�ܵ���˵��
	1.���Σ����÷��������齻������ֵ��ʱ�򣩵ĵ���ʲô�������˽���
	��Ҫ����Ҫ������������������ʲô
	�������������ڸ�ֵ��ʱ����ֱ�Ӹ�ֵ��Ҳ��ֵ����Ҳ��ֵ����
	�������������ڸ�ֵ��ʱ���Ǹ���ַ�ģ�Ҳ�е�ַ����Ҳ�е�ַ����

	2.ÿ����һ�����������߳̾ͻ��ܹ�ȥִ�У����ҿ���һ��ĳĳ����ջ��
	���߳���ջ��������󣬾ͻᱻ����

	3.�����������͵ı����д���ǵ�ַ����ָ����е�ĳ�����ݿռ�

	4.���һ�����ݿռ䣨���飬ĳ������󣩾ͻᱻ����
 */