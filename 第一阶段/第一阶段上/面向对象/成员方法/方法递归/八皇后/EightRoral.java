public class EightRoral{
	//����һ����ά����
	
	
	public static void main(String[] args){
		int[][] arr = new int[8][8];
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}


class queens{
	//˼·����
	//1.������ά����
	//2.�ߵĲ��ԣ����������ʺ��ܴ���ͬһ�С�ͬһ�л�ͬһб���ϣ����ж����ְڷ�
	//	0��������»ʺ��λ�ã�1�����Ѿ���ǰλ���Ѿ����£�2����ǰλ���߹�������
	//3.�ӵ�һ�е�һ�п�ʼ��
	//4.����һ�е�8�н���
	public int[][] way(int[][] arr,int i,int j){
		//����һ�в��ж��ظ�
		for(int a;a<8;a++){
			if(arr[i][a]==0){
				arr[i][a] = 1;
				break;
			}
		}
		if(arr[i][j] == 0){
			arr[i][j] = 1;
		}
		else{

		}
	}
}