public class Exercise01 {

	public static void main(String[] args) {
		//定义一个死循环，
		//定义一个现金变量，和一个用于记录次数的变量
		//在循环中用两个if判断现金数量
		//当经过到某一次时，不满足条件要退出循环break
		double cash = 100000.0;
		int i = 0;
		while(true){
			if(cash >= 50000){
				double short_cut = cash * 0.05;
				cash -= short_cut;
				i++;
			}
			else if(cash >= 1000){//答案错了是这里是代码逻辑错了，因为cash减成负数了，一开始还是大于零，一剪变负数
				cash -= 1000;
				i++;
			}
			
			else{
				break;
			}
			

		}
		System.out.println(i);//63，，答案62
		System.out.println(cash);
	}
}