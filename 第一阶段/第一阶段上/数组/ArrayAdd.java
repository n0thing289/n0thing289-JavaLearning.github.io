import java.util.Scanner;
public class ArrayAdd {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);
		int[] arr = {1,2,3};
		boolean flag = true;
		while(flag){
			
			System.out.println("enter a num to add in array:");
			int my_num = my_scanner.nextInt();
			//定义一个临时的变量，将他在原来的大小上扩容1一个元素
 			int[] arrnew = new int[arr.length+1];
 			//拷贝原始的数组
			for(int s=0;s<arr.length;s++){
				arrnew[s] = arr[s];
				System.out.println(arr[s]);
			}
			//在末尾添加新元素
			arrnew[arrnew.length-1] = my_num;
			arr = arrnew;

			//输出结果
			System.out.println("========");
			for(int i =0;i<arrnew.length;i++){
				System.out.println(arrnew[i] + "\t");
			}
			
			System.out.println("yes or no?");
			char yn = my_scanner.next().charAt(0);
			if(yn == 'n'){
				flag = false;
			}
			
		}
		
		

	}
}