public class ArrayReduce {

	public static void main(String[] args) {
		//˼·����
		//1.����ԭʼ����
		//2.�ٶ���һ����ԭʼ����С����ʱ����
		//3.��������ʱ����ʱ�����һ�����鲻ȡ��Ҳ���������������һ��
		//4.��arrָ����ʱ����
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arrNew = new int[arr.length-1];
		for(int i = 0;i<arrNew.length;i++){
			arrNew[i] = arr[i];
		}
		arr = arrNew;

		System.out.println("=====������Ľ��=====");
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}