public class HanoiTower{
	public static void main(String[] args){
		test my_test = new test();
		my_test.move(1,'A','B','C');
	}
}


class test{
	public void move(int num, char a, char b, char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		}
		else{
			//����ж���̣����Կ���������������ĺ������������
			//��1�����ƶ��������е��̵�b������c
			move(num -1,a,c,b);
			//(2)�������������̣��ƶ���c
			System.out.println(a + "->" + c);
			//(3)�ٰ�b���������̣��ƶ���c������a
			move(num -1,b,a,c);
		}
	}
}