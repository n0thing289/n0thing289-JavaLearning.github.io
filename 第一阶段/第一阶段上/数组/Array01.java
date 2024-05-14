public class Array01 {

	public static void main(String[] args) {
		double var1 = 3;
		double var2 = 5;
		double var3 = 3.4;
		double var4 = 2;
		double var5 = 50;
		double var6 = 2;
		while(true){
			System.out.println(var1);
			break;
		}

		double [] arr = {3, 5, 3.4, 1, 2, 50, 7.8};
		int i = 0;
		double totalweight = 0.0;
		while(i < arr.length){
			System.out.println(arr[i]);
			totalweight += arr[i];
			i++;
			
		}
		System.out.println("totalweight=" + totalweight + " averageweight=" + (totalweight/arr.length));
	}
}