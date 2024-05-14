public class OverLoadExercise01{
	public static void main(String[] args){
		Methods my_methods = new Methods();
		my_methods.m(10);
		my_methods.m(10 * 100);
		my_methods.m("hello world");

		System.out.println(my_methods.max(79,69));
		System.out.println(my_methods.max(12.3,13.3));
		System.out.println(my_methods.max(119.218,110.221,120.222));


	}
}


class Methods{
	public void m(int n1){
		System.out.println("Æ½·½= " + n1 * n1);
	}

	public void m(int n1, int n2){
		System.out.println("Ïà³Ë= " + n1 * n2);
	}

	public void m(String n1){
		System.out.println(n1);
	}



	public int max(int n1, int n2){
		return (n1 > n2) ?  n1 :  n2;
	}

	public double max(double n1, double n2){
		return (n1 > n2) ?  n1 :  n2;
	}

	public double max(double n1, double n2, double n3){
		if(n1 > n2){
			if(n1 > n3){
				return n1;
			}
			else{
				return n3;
			}
		}
		else{
			if(n2 > n3){
				return n2;
			}
			else{
				return n3;
			}
		}

		// double max = (n1 > n2) ? n1 :n2;
		// return (max > n3) ? max : n3;
	
	}	
}