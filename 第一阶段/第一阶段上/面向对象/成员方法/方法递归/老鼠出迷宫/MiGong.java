public class MiGong{
	//˼·���ģ�
	//  1.���ù���
	//  2.�˳��ݹ������
	//  3.��·����
	public static void main(String[] args){
		//˼·����
		//1.�ȴ����Թ����ö�ά�����ʾ
		//2.�涨��0��ʾ���ϰ��1��ʾ���ϰ���
		int[][] map = new int[8][7];
		for(int i=0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i=0;i<map.length;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;


		//����鿴
		System.out.println("===��·֮ǰ===");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//��·
		T t1 = new T();
		t1.findway2(map,1,1);
		System.out.println("===��·֮��===");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}


class T{

	//1.findway����ר�������Թ���·��
	//2.����ҵ��ͷ���true�����򷵻�false
	//3.map�Ƕ�ά���飬����ʾ�Թ�
	//4.i��j������ĳ�ʼλ��
	//5.��Ϊ�����ǵݹ���·������Ҫ�ȹ涨map�������ֵ�ĺ���
	//	0��ʾ�����ߣ�1��ʾ�ϰ��2��ʾ�����ߣ�3��ʾ�߹��������߲�ͨ
	//6.��map[6][5]=2ʱ˵���ҵ�ͨ·���Ϳ��Խ��������������
	//7.��·���� �� �� �� ��
	public boolean findway(int[][] map, int i, int j){
		if(map[6][5] == 2){//��Ϊ�ݹ�Ҫ�ȹ涨���˳��ݹ��ʱ��
			return true;
		}
		else{
			if(map[i][j] == 0){//�����㺬�������
				//һ������涨��0�����ߣ�����ᳬ���������޷���������
				//���������Ƕ���⣬����Ҫ��0���ж�
				map[i][j] = 2;//�ٶ�������
				if(findway(map,i+1,j)){//��
					return true;
				}
				else if(findway(map,i,j+1)){//��
					return true;
				}
				else if(findway(map,i-1,j)){//��
					return true;
				}
				else if(findway(map,i,j-1)){//��
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}
			}
			else{
				return false;
			}
			
		}
	}

	//�ı���·���ԣ���������
	public boolean findway2(int[][] map, int i, int j){
		if(map[6][5] == 2){//��Ϊ�ݹ�Ҫ�ȹ涨���˳��ݹ��ʱ��
			return true;
		}
		else{
			if(map[i][j] == 0){//�����㺬�������
				//һ������涨��0�����ߣ�����ᳬ���������޷���������
				//���������Ƕ���⣬����Ҫ��0���ж�
				map[i][j] = 2;//�ٶ�������
				if(findway2(map,i-1,j)){//��
					return true;
				}
				else if(findway2(map,i,j+1)){//��
					return true;
				}
				else if(findway2(map,i+1,j)){//��
					return true;
				}
				else if(findway2(map,i,j-1)){//��
					return true;
				}
				else{
					map[i][j] = 3;
					return false;
				}
			}
			else{
				return false;
			}
			
		}
	}
}//����ѧͼ���㷨�������·������������Ҫ�Լ�һ��һ����ݸ���������ݹ�����ÿһ����