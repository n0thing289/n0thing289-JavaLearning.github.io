public class recurtion01{
	public static void main(String[] args){
		T t1 = new T();
		t1.test(4);
		int res = t1.f(5);
		System.out.println("res=" + res);
	}
}


class T{
	//定义方法的思路
	//1.确定返回类型
	//2.方法名
	//3.形参
	//4.方法体
	public void test(int n){
		if(n > 2){
			test(n - 1);
		}
		System.out.println("n="+n);//若把输出语句写入else，那么输出结果又如何？
	}


	public int f(int n){
		if(n == 1){
			return 1;
		}
		else{
			return f(n - 1) * n;
		}
	}
}