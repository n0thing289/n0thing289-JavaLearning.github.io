public class Object01 {
	public static void main(String[] args){
		//1.new Cat() ����һ��è����; �Ѵ�����è���� cat
		
		Cat cat = new Cat();
		//4.��ô����������Ը�ֵs
		cat.name = "xiaobai";
		cat.age = 3;
		cat.color = "white";
		cat.weight = 10;

		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 20;

		//3.��ô���ʶ���������أ�
		System.out.println("the first cat is " + cat.name + "�� hes age is " + cat.age + "�� hes color is " + cat.color + " weight:" + cat.weight);
		System.out.println("the secend cat is " + cat2.name + "�� hes age is " + cat2.age + "�� hes color is " + cat2.color + " weight:" + cat2.weight);
	}
}

class Cat {
	//2.��������
	String name;
	int age;
	String color;
	double weight;//�����ⲿ���壬�Զ����

}