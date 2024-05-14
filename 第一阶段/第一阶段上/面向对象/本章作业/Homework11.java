
public class Homework11{
	public void test(){
		System.out.println(method(method(10.0, 20.0), 100));
	}

	public double method(double num1, double num2){
		return num1 + num2;
	}


	public static void main(String[] args){
		Homework11 myHomework11 = new Homework11();
		myHomework11.test();
	}
}


