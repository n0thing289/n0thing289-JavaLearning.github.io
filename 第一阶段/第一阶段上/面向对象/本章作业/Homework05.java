//做对了
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
	//1.定义属性：半径
	//2.定义方法一显示圆周长，2Πr
	//3.定义方法二显示园面积，Πr**2
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