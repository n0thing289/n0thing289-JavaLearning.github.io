public class MethodParameter03 {
	public static void main(String[] args){

		//
		Person p = new Person();
		B b = new B();
		
		p.age = 10;
		p.name = "jack";

		b.test200(p);
		System.out.println("p.age = " + p.age );
	}
}


class Person{
	int age;
	String name;
}


class B{
	public void test200(Person p){
		//˼�� p = null,main���ʲô��
		// ��Ϊtest200�ڵ�p���ȶ��壬
		// Ȼ������ⲿp�ĵ�ַ��Ȼ���ڲ�pָ��
		// ���ⲿp��Ȼ����֮ǰ�ĵ�ַ����û�з����仯��ֻ���ڲ���pָ���˶���
		// 1.�������β��Ǿֲ��������Ƕ�����ĳĳ������ջ��
		// 2.���ݵ���Ȼ�ǵ�ַ��������Ҫ�μ����β�p�����ⲿp�ĵ�ַ����ʹ�ڲ�ָ�գ�Ҳ���ڲ�p�޷�ʹ�ã�Ӱ�첻���ⲿp
		
		// p = null;
		//˼�� p = new Person()�����У�main�����ʲô��
		//ԭ��������ǲ��ģ��ڲ���pԭ��ָ���ⲿp�����ݿռ�
		//Ȼ��new֮��ָ�����µ�һ�����ݿռ�
		//��Ȼ��Ӱ���ⲿ
		p = new Person();
		p.age = 20;
		p.name = "joey";

		
	}
}