public class Method02{
	public static void main(String[] args){
		//����һ�����飬�������ĸ���Ԫ��ֵ
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		// //����map����
		// //��ͳ�Ľ����ʽ����ֱ�ӱ���
		// for(int i=0;i<map.length;i++){
		// 	for(int j=0;j<map[i].length;j++){
		// 		System.out.println(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		// 
		MyTools tool = new MyTools();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
	}
}


//������Ĺ��ܣ�д��һ����ķ����У���ε��øķ�������
class MyTools {
	public void printArr(int[][] map){
		System.out.println("=============");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.println(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}