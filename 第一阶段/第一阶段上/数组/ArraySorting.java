public class ArraySorting{
	public static void main(String[] args){
		/*
		ð��������ص�
			�м���Ԫ�أ����м���-1��
			ÿһ�����򶼿���ȷ��һ������λ��
			�����бȽ�ʱ�����ǰ��������ں���������ͽ���
			ÿһ�ֵıȽ��ڼ���
				���磬Ҫ��5��Ԫ������
					������
					4
					3
					2
					1
					
		 */
		//˼·����
		//��һ������Ŀ���ǰ�����ֵ�ƶ������
		//1.����һ��ԭʼ����
		//2.��fooѭ��������ȡǰһ���ͺ�һ��������ֵ
		//3.�ж�������ֵ��ǰһ���ͺ�һ���ȣ����ǰһ�����ں�һ�����򽻻�λ��
		//
		//����һ��ѭ��
		//1.���ѭ���ĵĴ���ʱ���֣�
		//2.�ڲ�ѭ��ÿ��Ҫ�𽥼����ж� 4>3>2>1
		int[] arr = {24,69,80,57,13};
		int flag = 1;
		int j = 0;
		int count = 0;
		while(flag<=arr.length-1){
			//0 arr.length    4
			//0 arr.length-1  3
			//0 arr.length-2  2  
			// ��ĳһ�ֵ�������ŵ�����
			for(int i = 0;i<arr.length-j;i++){
				if((i+1)<=(arr.length-1) && arr[i] > arr[i+1]){
					
					int var = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = var;
					count++;
				}
			}
			
			System.out.println(count);
			flag++;
			j++;//������ܷ���for��i++�ĺ��棬��Ȼj��ǰ�����˺ܶ࣬��û��������
		}
		System.out.println("\n=======================");
		for(int p=0;p<arr.length;p++){
			System.out.print(arr[p] + "\t");
		}
	}
}