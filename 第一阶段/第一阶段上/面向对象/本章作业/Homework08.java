//×ö¶ÔÁË
public class Homework08{
	int count = 9;


	public void count1(){
		count = 10;
		System.out.println("count1=" + count);
	}
	
	public void count2(){
		System.out.println("count1=" + count++);
	}	



	public static void main(String[] args){
		new Homework08().count1();//10  true
		Homework08 h1 = new Homework08();
		h1.count2();//9  true   -->   10
		h1.count2();//10  true -->   11
	}
}


