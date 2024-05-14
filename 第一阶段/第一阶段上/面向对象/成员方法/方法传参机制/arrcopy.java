public class arrcopy{
	public static void main(String[] args){
		//Êý×é¿½±´
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];
		for(int i=0;i<arr2.length;i++){
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}

	}
}