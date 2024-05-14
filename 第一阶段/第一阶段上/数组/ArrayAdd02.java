import java.util.Scanner;
public class ArrayAdd {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);
		int[] arr = {1,2,3};
		boolean flag = true;
		while(flag){
			
			System.out.println("enter a num to add in array:");
			int my_num = my_scanner.nextInt();
;			int[] arrnew = new int[arr.length+1];
			for(int s=0;s<arr.length;s++){
				arrnew[s] = arr[s];
				System.out.println(arr[s]);
			}
			arrnew[arrnew.length-1] = my_num;
			arr = arrnew;

			//Êä³ö½á¹û
			System.out.println("========");
			for(int i =0;i<arrnew.length;i++){
				System.out.println(arrnew[i]);
			}
			
			System.out.println("yes or no?");
			char yn = my_scanner.next().charAt(0);
			if(yn == 'n'){
				flag = false;
			}
			
		}
		
		

	}
}