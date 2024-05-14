public class Homework01{
	public static void main(String[] args){
		// double [] arr = {1,7,6,5,4,3,2,8};
 	// 	A01 my_A = new A01();
		// System.out.println(my_A.max(arr));


        ///////////////////////////////////////////////
        double[] arr2 = null;//引用数据类型可以指空
		LaoHanZuoFa zhengque = new LaoHanZuoFa();
		Double res = zhengque.max(arr2);
		if(res != null){
			System.out.println(zhengque.max(arr2));
		}
		else{
			System.out.println("arr输入有误，不能输入null或者{}");
		}
	}
}


class A01{
	public double max(double[] arr){
		double maxNumber = 0;
		double maxNum = 0;
		for(int i=0;i<arr.length;i++){
			double temp1 = arr[i];
			for(int j=0;j<arr.length;j++){
				double temp2 = arr[j];
				maxNumber = temp1 > temp2 ? temp1 : temp2;
				maxNum = maxNum > maxNumber ? maxNum : maxNumber;

			}
		}
		return maxNum;
	}
}


class LaoHanZuoFa{
	public Double max(double[] arr){
		if( arr != null && arr.length > 0){//2.
			double max = arr[0];
			for(int i=0;i<arr.length;i++){
				if(max < arr[i]){
					max = arr[i];
				}
			}
			return max;
		}
		else{
			return null;//1.
		}
	}
}