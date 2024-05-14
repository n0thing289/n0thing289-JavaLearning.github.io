public class MethodExercise01{
	public static void main(String[] args){
		AA a = new AA();

		boolean n = a.isOdds(6667);
		System.out.println("\n " + n);

		a.print(20,10,'@');
	}
}


class AA {
	public boolean isOdds(int n){
		boolean flag = false;
		// if(n % 2.0 == 0){
		// 	System.out.println(n + " is 偶数.");
		// 	return flag;
		// }
		// else{
		// 	System.out.println(n + " is 奇数.");
		// 	return (!flag);
		// }
		// 
		// return n % 2.0 != 0 
		return n %2.0 !=0;
	}

	public void print(int lines, int colsn, char c) {
		for(int i=1;i<=lines;i++){//控制行
			for(int j=0;j<=cols;j++){//控制列
				System.out.print(c);
			}
			System.out.println("");
			
		}
	}
}