public class VarParameter01{
	public static void main(String[] args){
		A a = new A();
		System.out.println(a.sum(1,2,3,4,5,6,7,8,9,10));
	}
}


class A{
	public int sum(int... nums){
		//�����ʱ�����β��б��� int... ������
		//ʹ�õ�ʱ���ǽ�nums����һ������
		
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		} 
		return res;
	}
}

