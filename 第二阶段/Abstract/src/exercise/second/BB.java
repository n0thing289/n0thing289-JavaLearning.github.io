package exercise.second;

public class BB extends Template{
	public static String name = "exercise.second.BB";
	public void job(){
		long num = 0;
		for(int i=0;i<2000000000;i++){
			num += i;
		}
	}
	public void show(){
		System.out.println(this.name + super.calculateTime());
	}
}