public class MethodDetail{
	public static void main(String[] args){
		AA a = new AA();
		int [] res = a.getSumAndSub(1,2);//
		System.out.println("��="+res[0]);
		System.out.println("��="+res[1]);
		
	}
}


class AA {
	//1. һ���������һ������ֵ
	public int[] getSumAndSub(int n1, int n2){
		int [] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. �������Ϳ���Ϊ�������ͣ������������ͺͻ�����������
	
	//3. �������Ҫ�󷵻��������ͣ��򷽷���������ִ��������Ϊ��Ӧ�Ļ��߿��Զ�ת����ֵ
	public double f1(){
		double d1 = 1.1;
		int n1 = 100;
		return d1;//d1 double-> double
		//n1 int -> double
	}
	//4. �������д��void������Բ�дreturn����ֻдreturn;
	public void f2(){
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		return;
	}
}