public class VarParameterExercise01{
	public static void main(String[] args){
		HspMethod m = new HspMethod();
		m.showScore("jack",100,100);
		m.showScore("joey",99,80,100);
		m.showScore("chandle",50,70,10,20,50);
	}
}


class HspMethod{
	public double showScore(String name, double... scores){
		
		//返回总分
		double res = 0;
		for(int i=0;i<scores.length;i++){
			res += scores[i];
		}
		System.out.println(name + "有" + scores.length + "门课其总成绩为：" + res);
		return res;

	}
}