//做对了！
public class Homework04{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		A03 myA03 = new A03();
		int[] newArr = myA03.copyArr(arr);
		for(int j=0;j<newArr.length;j++){
			System.out.println(newArr[j]);
		}
	}
}


class A03{
	//1.定义一个公共的，返回数组类型，copyArr，接收数组作为参数
	//2.在方法内部定义一个新的数组，大小和参数数组一致
	//3.用for循环将旧数组的值不断赋值给新数组
	//4.返回新数组的引用
	public int[] copyArr(int[] oldArr){
		int[] newArr = new int[oldArr.length];
		for(int i=0;i<oldArr.length;i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}