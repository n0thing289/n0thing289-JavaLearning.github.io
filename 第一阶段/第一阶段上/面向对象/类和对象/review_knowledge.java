public class review_knowledge {
	public static void main(String[] args){
		//2.����һ��è����
		// Cat cat1 = new Cat();

		// //3.������������
		// cat1.age = 1;
		// cat1.weight = 10;
		// cat1.color = "black";
		// cat1.voice = "bad";
		// //4.������ӡ
		// System.out.println("��ֻè������Ϊ "+cat1.age+  " ����Ϊ " + cat1.weight+" ��ɫΪ "+cat1.color);
		// System.out.println(cat1.voice);

		//============================================
		//�β��б������䣬���أ���ɫ������
		//1.�������������
		Cat cat2 = new Cat(2,15.6,"pink","good");
		//2.��ӡ�ڶ�֧è
		System.out.println("��ֻè������Ϊ "+cat2.age+  " ����Ϊ " + cat2.weight+" ��ɫΪ "+cat2.color);
		System.out.println(cat2.voice);

		//���÷���
		cat2.study();
		double money = cat2.stole_money("���γ�",10000.999);
		System.out.println("èè���͵����"+money+"��ô��Ǯ");
	}
}


class Cat {
	//1.����һ��è�࣬���������䣬���أ���ɫ
	int age;
	double weight;
	String color;
	//�ڲ��͸�������ú͸�ֵ
	String voice;

	//ÿ�δ�����Ҫ���ⲿ��ÿһֻè��ֵһ��һ���������̫�鷳����û�и��򵥵ķ�ʽ
	//ͨ�����������������˹��췽���������д���������ʱ��Ҫ�����β��б������
	Cat(int age,double weight,String color,String voice) {//��void���ᱨ��û�аѲ��������������Ĵ�
		this.age = age;
		this.weight = weight;
		this.color = color;
		this.voice = voice;
	}

	public void study(){
		System.out.println("èèͨ��ѧϰ��ѧ����͵Ǯ����");
	}
	public double stole_money(String person, double money){
		System.out.println("èè���쿴���˽� " + person + " ��������ϵ�" + money + "��ô��Ǯ");
		System.out.println("͵Ǯ�ɹ�����");
		return money;
	}
}