public class ArrayReverse02 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};//��ʱ��û��ȥ���ûᱻ�����ڴ�
		//���򿽱�˼·
		//1.�ȴ���һ���µ�moren����
		//2.��һ�����������ϼ��٣����Ա���ԭ��������������������Բ����м������Ƶı���
		//3.��һ�������������������������������
		//4.����ԭ���飬���������������Ӧ��ֵ�������������
		//5.������������ø�Ϊ������ĵ�ַ
		int[] arr2 = new int[arr.length];
		int n = 0;
		int len = arr.length;//why I do that?
		for(int i = (len-1);i>=0;i--){
			arr2[n] = arr[i];
			n++;
			//System.out.println(arr2[n]);
		}
		arr = arr2;//���ÿ���
		for(int j=0;j<len;j++){
			System.out.println(arr[j]);
		}
	}
}