public class houzichitao{
	public static void main(String[] args){
		//1��1��2��3��5��8��13...
		F f1 = new F();
		int rec = f1.fbnq(10);
		if(rec != -1){
			System.out.println(rec);
		}

		int day = 0;
		int rec2 = f1.peach(day);
		if(rec2 !=-1){
			System.out.println("day:"+day+" ��Ӧ�����ӣ�"+rec2);
		}
		
	}
}


class F{
	public int fbnq(int n){
		if(n >=1){
			if(n==1||n==2){
				return 1;
			}
			else{
				return fbnq(n-1) + fbnq(n-2);
			}
		}
		else{
			System.out.println("��������������������ڵ���1������!");
			return -1;
		}
		
	}


	public int peach(int day){
		/*
		˼·���������Ϻ���˼·���������Ƶķ���ȥ�Ƴ�987���Ӧ�����ӣ�
		���ҵõ�һ��ǰ������������Ŀ�Ĺ�ϵʽ
		��ʮ��    1�����ӣ�1= ��/2 - 1��
		�ھ���    ��1 + 1��* 2 = 4 ��4= ��/2 - 1��
		�ڰ���    ��4 + 1��* 2 = 10
		.
		.
		.
		���Եõ�������һ���������+1��*2 = ǰһ���������
		 */
		if(day==10){
			return 1;
		}
		else if(day>=1 && day<=9){
			return (peach(day+1) + 1)*2;
		}
		else{
			System.out.println("������������������1-10������");
			return -1;
		}
	}
}