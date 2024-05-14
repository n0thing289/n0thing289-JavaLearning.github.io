public class ArrayReverse02 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};//到时候没人去引用会被回收内存
		//逆序拷贝思路
		//1.先创建一个新的moren数组
		//2.用一个变量，不断减少，可以保存原数组的逆向索引，并可以不断有减少趋势的变量
		//3.用一个变量，不断增大，用于新数组的索引
		//4.遍历原数组，并将逆序的索引对应的值给正序的新数组
		//5.将旧数组的引用改为新数组的地址
		int[] arr2 = new int[arr.length];
		int n = 0;
		int len = arr.length;//why I do that?
		for(int i = (len-1);i>=0;i--){
			arr2[n] = arr[i];
			n++;
			//System.out.println(arr2[n]);
		}
		arr = arr2;//引用拷贝
		for(int j=0;j<len;j++){
			System.out.println(arr[j]);
		}
	}
}