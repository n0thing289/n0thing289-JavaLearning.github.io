public class recurtionExercise01{
	public static void main(String[] args){
		//1，1，2，3，5，8，13...
		F f1 = new F();
		int rec = f1.fbnq(100);
		if(rec != -1){
			System.out.println(rec);
		}
		
	}
}


class F{
	public int fbnq(int n){
		if(n >=1){
			if(n==1||n==2){
				return 1;
			}
			else{
				return fbnq(n-1) + fbnq(n-2);
			}
		}
		else{
			System.out.println("输入有误请重新输入大于等于1的项数!");
			return -1;
		}
		
	}
}