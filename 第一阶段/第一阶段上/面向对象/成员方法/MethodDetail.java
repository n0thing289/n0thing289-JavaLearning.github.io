public class MethodDetail{
	public static void main(String[] args){
		AA a = new AA();
		int [] res = a.getSumAndSub(1,2);//
		System.out.println("和="+res[0]);
		System.out.println("差="+res[1]);
		
	}
}


class AA {
	//1. 一个方法最多一个返回值
	public int[] getSumAndSub(int n1, int n2){
		int [] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. 返回类型可以为任意类型，包括引用类型和基本数据类型
	
	//3. 如果方法要求返回数据类型，则方法体中最后的执行语句必须为对应的或者可自动转换的值
	public double f1(){
		double d1 = 1.1;
		int n1 = 100;
		return d1;//d1 double-> double
		//n1 int -> double
	}
	//4. 如果方法写了void，则可以不写return或者只写return;
	public void f2(){
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		return;
	}
}