public class ObjectTest01 {
	public static void main(String[] args){
		Person a = new Person();
		a.age = 10;
		a.name = "С��";
		Person b;
		b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null;
		/*
		����bָ���ʱ���Ͳ��ٻ�ָ��0x1011�ࣨ���ݿռ䣩�µ��κ�������
		 */
		System.out.println(a.age);
		System.out.println(b.age);//��������ᱨ��
	}
}

class Person {
	int age;
	String name;
}