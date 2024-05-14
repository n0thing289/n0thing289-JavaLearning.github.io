public class BubbleSorting{
	public static void main(String[] args){
		//先搞定第一轮的
		//1.定义原始的数组
		//2.在for中遍历，并且比较前一个索引的值和后一个索引的值
		//3.如果大于就交换
		//4.输出提示信息验证一下
		
		//再来一个外层循环
		//1.外层循环是4论（arr.length-1）
		//2.内层的最大索引要不断减少1次，当外层循环一次之后
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