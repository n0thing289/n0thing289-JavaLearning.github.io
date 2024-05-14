public class EightRoral{
	//创建一个二维数组
	
	
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
	//思路分析
	//1.创建二维数组
	//2.走的策略，任意两个皇后不能处于同一行。同一列或同一斜线上，问有多少种摆法
	//	0代表可以下皇后的位置，1代表已经当前位置已经被下，2代表当前位置走过不能走
	//3.从第一行第一列开始放
	//4.到第一行第8列结束
	public int[][] way(int[][] arr,int i,int j){
		//遍历一行并判断重复
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