public class MiGong{
	//思路核心：
	//  1.定好规则
	//  2.退出递归的条件
	//  3.找路策略
	public static void main(String[] args){
		//思路分析
		//1.先创建迷宫，用二维数组表示
		//2.规定，0表示无障碍物，1表示有障碍物
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


		//输出查看
		System.out.println("===找路之前===");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//找路
		T t1 = new T();
		t1.findway2(map,1,1);
		System.out.println("===找路之后===");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}


class T{

	//1.findway方法专门来找迷宫的路径
	//2.如果找到就返回true，否则返回false
	//3.map是二维数组，即表示迷宫
	//4.i，j是老鼠的初始位置
	//5.因为我们是递归找路，所以要先规定map数组各个值的含义
	//	0表示可以走，1表示障碍物，2表示可以走，3表示走过，但是走不通
	//6.当map[6][5]=2时说明找到通路，就可以结束，否则继续找
	//7.找路策略 下 右 上 左
	public boolean findway(int[][] map, int i, int j){
		if(map[6][5] == 2){//因为递归要先规定好退出递归的时机
			return true;
		}
		else{
			if(map[i][j] == 0){//有两层含义在这里，
				//一如果不规定在0里面走，数组会超出索引，无法继续运行
				//二从正常角度理解，我们要在0中行动
				map[i][j] = 2;//假定可以走
				if(findway(map,i+1,j)){//下
					return true;
				}
				else if(findway(map,i,j+1)){//右
					return true;
				}
				else if(findway(map,i-1,j)){//上
					return true;
				}
				else if(findway(map,i,j-1)){//左
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

	//改变找路策略，上右下左
	public boolean findway2(int[][] map, int i, int j){
		if(map[6][5] == 2){//因为递归要先规定好退出递归的时机
			return true;
		}
		else{
			if(map[i][j] == 0){//有两层含义在这里，
				//一如果不规定在0里面走，数组会超出索引，无法继续运行
				//二从正常角度理解，我们要在0中行动
				map[i][j] = 2;//假定可以走
				if(findway2(map,i-1,j)){//上
					return true;
				}
				else if(findway2(map,i,j+1)){//右
					return true;
				}
				else if(findway2(map,i+1,j)){//下
					return true;
				}
				else if(findway2(map,i,j-1)){//左
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
}//后面学图，算法来求最短路径，现在你需要自己一步一步打草稿理解三个递归程序的每一步！