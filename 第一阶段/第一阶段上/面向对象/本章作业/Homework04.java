//�����ˣ�
public class Homework04{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		A03 myA03 = new A03();
		int[] newArr = myA03.copyArr(arr);
		for(int j=0;j<newArr.length;j++){
			System.out.println(newArr[j]);
		}
	}
}


class A03{
	//1.����һ�������ģ������������ͣ�copyArr������������Ϊ����
	//2.�ڷ����ڲ�����һ���µ����飬��С�Ͳ�������һ��
	//3.��forѭ�����������ֵ���ϸ�ֵ��������
	//4.���������������
	public int[] copyArr(int[] oldArr){
		int[] newArr = new int[oldArr.length];
		for(int i=0;i<oldArr.length;i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}