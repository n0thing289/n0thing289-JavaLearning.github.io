import java.util.Scanner;
import java.util.Random;
public class Homework14{
	public static void main(String[] args){
		System.out.println("��ӭ����Moragame��\n\n\n");
		Moragame myMoragame = new Moragame();
		for(int i=1;i<4;i++){
			myMoragame.huoqushuru();
			myMoragame.random();
			System.out.println("======================================================");
			System.out.println("����\t" + "��ҵĳ�ȭ\t" + "���Եĳ�ȭ\t" + "��Ӯ���");
			System.out.print(i + "\t" + myMoragame.personNum + "\t\t" + myMoragame.computerNum + "\t\t");
			myMoragame.isWin();
			System.out.println("======================================================\n\n\n");
		}
	}
}

//1. ʵ�����������
//2. ��Ӯ�ж�
//3�� ��¼���̵Ĺ���
//4. ���
//
//
//
class Moragame{
	int personNum;
	int computerNum;
	int personWinCount;
	int computerWinCount;
	public void random(){
		//���������
		Random myRandom = new Random();
		this.computerNum = myRandom.nextInt(3);
	}

	public void huoqushuru(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ����ȭͷ��0-ʯͷ 1-���� 2-����");
		this.personNum = scanner.nextInt();
	}

	public void isWin(){
		if(personNum == computerNum){
			System.out.println("ƽ��");
		}

		else if(personNum == 0 && computerNum == 1){
			System.out.println("��Ӯ");
			this.personWinCount++;
		}

		else if(personNum == 1 && computerNum == 2){
			System.out.println("��Ӯ");
			this.personWinCount++;
		}

		else if(personNum == 2 && computerNum == 0){
			System.out.println("��Ӯ");
			this.personWinCount++;
		}
		else{
			System.out.println("����Ӯ");
			this.computerWinCount++;
		}
	}
}
