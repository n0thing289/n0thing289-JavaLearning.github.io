public class Homework13{
	public static void main(String[] args){
		Circle c1 = new Circle();
		PassObject p1 = new PassObject();
		p1.printAreas(c1, 5);
	}
}


class Circle{
	double radius = 1;

	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}


	public double findArea(){
		return 3.14 * Math.pow(this.radius,2);
	}
}


class PassObject{
	public void printAreas(Circle c, int times){
		System.out.println("Radius" + "\t\t" + "Area");
		for(int i = 1;i<=times;i++){
			c.radius = i;
			System.out.println(i + "\t\t" + c.findArea());
		}
	}
}