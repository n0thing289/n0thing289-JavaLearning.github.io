public class Homework06{
	public static void main(String[] args){
		Cale myCale1 = new Cale(5, 10);
		myCale1.add();
		myCale1.subtract();
		myCale1.multiply();
		myCale1.divide();
	}
}


class Cale{
	//������������
	//1.������������һ����λ��������
	//2.�����ĸ������������أ�ֱ�����
	double num1;
	double num2;

	public Cale(){

	}
	public Cale(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}


	public void add(){
		System.out.println(this.num1 + this.num2);
	}


	public void subtract(){
		System.out.println("\n" + (this.num1 - this.num2));
	}


	public void multiply(){
		System.out.println("\n" + (this.num1 * this.num2));
	}


	public void divide(){
		if(this.num2 != 0){
			System.out.println("\n" + (this.num1 / this.num2));
		}
		else{
			System.out.println("please check your input!,can't 0 at first");
		}
	}
}