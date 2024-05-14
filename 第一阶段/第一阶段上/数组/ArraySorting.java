public class ArraySorting{
	public static void main(String[] args){
		/*
		冒泡排序的特点
			有几个元素，就有几个-1轮
			每一轮排序都可以确定一个数的位置
			当进行比较时，如果前面的数大于后面的数，就交换
			每一轮的比较在减少
				例如，要对5个元素排序
					有四轮
					4
					3
					2
					1
					
		 */
		//思路分析
		//第一轮排序，目标是把最大的值移动到最后
		//1.定义一个原始数组
		//2.用foo循环遍历，取前一个和后一个索引的值
		//3.判断这两个值，前一个和后一个比，如果前一个大于后一个，则交换位置
		//
		//再套一层循环
		//1.外层循环的的次数时四轮，
		//2.内层循环每轮要逐渐减少判断 4>3>2>1
		int[] arr = {24,69,80,57,13};
		int flag = 1;
		int j = 0;
		int count = 0;
		while(flag<=arr.length-1){
			//0 arr.length    4
			//0 arr.length-1  3
			//0 arr.length-2  2  
			// 将某一轮的最大数放到后面
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
			j++;//这个不能放入for中i++的后面，不然j提前增大了很多，就没有意义了
		}
		System.out.println("\n=======================");
		for(int p=0;p<arr.length;p++){
			System.out.print(arr[p] + "\t");
		}
	}
}