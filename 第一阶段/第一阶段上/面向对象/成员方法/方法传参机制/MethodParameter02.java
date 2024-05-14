public class MethodParameter02 {
	public static void main(String[] args){

		//
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println("\n====main中 arr数组====");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");//200，2，3
		}
		System.out.println();
	}
}


class B{
	public void test100(int[] arr){
		arr[0] = 200;
		System.out.println(" ====test100 arr数组====");
		
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");//200，2，3
		}
	}
}