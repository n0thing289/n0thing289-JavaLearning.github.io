//������
public class Homework05{
	public static void main(String[] args){
		Circle myCircle1 = new Circle(2);
		myCircle1.yuanZhouChang();
		myCircle1.yuanMianJi();
		int i = 10;
		System.out.println(i++ + ++i);
	}
}


class Circle{
	//1.�������ԣ��뾶
	//2.���巽��һ��ʾԲ�ܳ���2��r
	//3.���巽������ʾ԰�������r**2
	double r;
	public Circle(){

	}
	public Circle(double r){
		this.r = r;
	}
	public void yuanZhouChang(){
		System.out.println(2 * this.r * 3.14);
	}

	public void yuanMianJi(){
		System.out.println(3.14 * Math.pow(this.r,2));
	}
}