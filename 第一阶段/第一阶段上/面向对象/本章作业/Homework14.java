import java.util.Scanner;
import java.util.Random;
public class Homework14{
	public static void main(String[] args){
		System.out.println("欢迎游玩Moragame！\n\n\n");
		Moragame myMoragame = new Moragame();
		for(int i=1;i<4;i++){
			myMoragame.huoqushuru();
			myMoragame.random();
			System.out.println("======================================================");
			System.out.println("局数\t" + "玩家的出拳\t" + "电脑的出拳\t" + "输赢情况");
			System.out.print(i + "\t" + myMoragame.personNum + "\t\t" + myMoragame.computerNum + "\t\t");
			myMoragame.isWin();
			System.out.println("======================================================\n\n\n");
		}
	}
}

//1. 实现随机数创建
//2. 输赢判断
//3。 记录复盘的功能
//4. 输出
//
//
//
class Moragame{
	int personNum;
	int computerNum;
	int personWinCount;
	int computerWinCount;
	public void random(){
		//随机数创建
		Random myRandom = new Random();
		this.computerNum = myRandom.nextInt(3);
	}

	public void huoqushuru(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要出的拳头（0-石头 1-剪刀 2-布）");
		this.personNum = scanner.nextInt();
	}

	public void isWin(){
		if(personNum == computerNum){
			System.out.println("平手");
		}

		else if(personNum == 0 && computerNum == 1){
			System.out.println("你赢");
			this.personWinCount++;
		}

		else if(personNum == 1 && computerNum == 2){
			System.out.println("你赢");
			this.personWinCount++;
		}

		else if(personNum == 2 && computerNum == 0){
			System.out.println("你赢");
			this.personWinCount++;
		}
		else{
			System.out.println("电脑赢");
			this.computerWinCount++;
		}
	}
}
