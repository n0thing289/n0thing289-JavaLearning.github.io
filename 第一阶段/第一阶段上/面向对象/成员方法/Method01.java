public class Method01{
	public static void main(String[] args){
		//����ʹ��
		//1. ����д�ú������ȥ���ã��������
		//2. �ȴ���������ε��÷�������
		Person p1 = new Person();
		p1.speak(); //���÷���
		p1.cal01();
		p1.cal02(2); //���ò��Ҵ���


		//����getSum���������Ұ�10��num1��20��num2
		//�ѷ��� getSum ���ص�ֵ���� ����returnRes
		int returnRes = p1.getSum(10,20); 
		System.out.println("getSum-returnRes= " + returnRes);
	}
}


class Person{
	String name;
	int age;
//===========================================================
	//��������Ա������
	//1.���speak��Ա�������������һ������
	//
	//1. public ��ʾ�����ǹ���
	//2. void ��ʾ����û�з���ֵ
	//2. speak����  speak�Ƿ��������������β��б�
	//4. {}  �����壬����д����Ҫִ�еĴ���
	//5.
	public void speak() {
		System.out.println("����һ������");
	}
//===========================================================
	//2. ����1-100
	public void cal01() {
		
		int sum = 0;
		for(int i = 1;i<=1000;i++){
			sum += i;
		}

		System.out.println("cal01-sum= " + sum);
	}
//===========================================================
	//���cal02����
	//�÷������Խ���һ����n�������1�ۼӵ�n
	//(int n) �β��б���ʾ��һ���β�n�����Խ����û�����
	public void cal02(int n){
		 
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum += i;
		}

		System.out.println("cal02-sum= " + sum);
	}
//===========================================================
	//���getSum��Ա���������Լ����������ĺ�
	//1.public ��ʾ��������
	//2. int ��ʾ����ִ�к󣬷���һ��intֵ
	//3. getSum������
	//4. (int num1, int num2) �β��б����Խ����û������������
	//5. return res; ��ʾ��res��ֵ������
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;

	}
}