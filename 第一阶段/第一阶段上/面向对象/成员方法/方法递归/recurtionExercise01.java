public class recurtionExercise01{
	public static void main(String[] args){
		//1£¬1£¬2£¬3£¬5£¬8£¬13...
		F f1 = new F();
		System.out.println(f1.fbnq(10));

	}
}


class F{
	public int fbnq(int n){
		if(n >=1){
			return fbnq(n -1) + fbnq(n -2);
		}
		else{
			return 1;
		}
		
	}
}