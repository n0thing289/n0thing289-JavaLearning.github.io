public class houzichitao{
	public static void main(String[] args){
		//1，1，2，3，5，8，13...
		F f1 = new F();
		int rec = f1.fbnq(10);
		if(rec != -1){
			System.out.println(rec);
		}

		int day = 0;
		int rec2 = f1.peach(day);
		if(rec2 !=-1){
			System.out.println("day:"+day+" 对应的桃子："+rec2);
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
			System.out.println("输入有误请重新输入大于等于1的项数!");
			return -1;
		}
		
	}


	public int peach(int day){
		/*
		思路分析：，老韩的思路是先用逆推的方法去推出987天对应的桃子，
		并且得到一个前天后后天桃子数目的关系式
		第十天    1个桃子（1= 九/2 - 1）
		第九天    （1 + 1）* 2 = 4 （4= 八/2 - 1）
		第八天    （4 + 1）* 2 = 10
		.
		.
		.
		可以得到，（后一天的桃子数+1）*2 = 前一天的桃子数
		 */
		if(day==10){
			return 1;
		}
		else if(day>=1 && day<=9){
			return (peach(day+1) + 1)*2;
		}
		else{
			System.out.println("输入有误请重新输入1-10的项数");
			return -1;
		}
	}
}