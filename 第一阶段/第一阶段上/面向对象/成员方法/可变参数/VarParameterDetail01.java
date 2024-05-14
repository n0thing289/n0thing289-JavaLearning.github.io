public class VarParameterDetail01{
	public static void main(String[] args){
		test m = new test();
		m.f1();
		int[] arr = {1,2,3};
	}
}


class test{
	public int f1(int... nums){
		System.out.println("f1参数个数为： " + nums.length);
		return 0;
	}


	public void f2(int... nums){
		int[] ar = nums[0];
		for(int i = 0; i< ar.length;i++){
			System.out.print(ar[i] + "\t");
		}
	}


	public void f3(double n1, int...nums){

	}

	public void f4(double n1, double... nums){

	}

	public void f5(double... nums1, int... nums2){

	}
}