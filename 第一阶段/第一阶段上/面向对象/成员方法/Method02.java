public class Method02{
	public static void main(String[] args){
		//遍历一个数组，输出数组的各个元素值
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};

		// //遍历map数组
		// //传统的解决方式就是直接遍历
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


//把输出的功能，写到一个类的方法中，如何调用改方法即可
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