public class recurtion01{
	public static void main(String[] args){
		T t1 = new T();
		t1.test(4);
		int res = t1.f(5);
		System.out.println("res=" + res);
	}
}


class T{
	//���巽����˼·
	//1.ȷ����������
	//2.������
	//3.�β�
	//4.������
	public void test(int n){
		if(n > 2){
			test(n - 1);
		}
		System.out.println("n="+n);//����������д��else����ô����������Σ�
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