public class BubbleSorting{
	public static void main(String[] args){
		//�ȸ㶨��һ�ֵ�
		//1.����ԭʼ������
		//2.��for�б��������ұȽ�ǰһ��������ֵ�ͺ�һ��������ֵ
		//3.������ھͽ���
		//4.�����ʾ��Ϣ��֤һ��
		
		//����һ�����ѭ��
		//1.���ѭ����4�ۣ�arr.length-1��
		//2.�ڲ���������Ҫ���ϼ���1�Σ������ѭ��һ��֮��
		int[] arr = {24,69,80,57,13};
		for(int j=0;j<arr.length-1;j++){
			for(int i =0;i<arr.length-j;i++){
				if((i+1<=arr.length-1) && arr[i]>arr[i+1]){
				int var = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = var;
				}
			}
		}
		
		//
		for(int s=0;s<arr.length;s++){
			System.out.print(arr[s] + "\t");
		}
		
	}
}