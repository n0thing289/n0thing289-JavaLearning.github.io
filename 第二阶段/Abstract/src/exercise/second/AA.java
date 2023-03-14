package exercise.second;

public class AA extends Template{
	
	public static String name = "exercise.second.AA";
	public void job(){
		long num = 0;
		for(int i=0;i<1000000000;i++){
			num += i;
		}
	}
//	public int addOne(final int x){
//		++x;
//		return x+1;
//	}

	public void show(){
		System.out.println(this.name + super.calculateTime());
	}
}