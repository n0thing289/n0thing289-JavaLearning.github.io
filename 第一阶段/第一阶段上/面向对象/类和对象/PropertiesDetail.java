public class PropertiesDetail {
	public static void main(String[] args){
		//����Person����
		//p1�Ƕ�����
		//new Person() �����Ķ���ռ䣨���飩���������Ķ���
		//
		//1.���������Ĭ��ֵ,��������Ĺ��� 
		Person p1 = new Person();


		System.out.println("\n��ǰ����˵���Ϣ");
		System.out.println("age=" + p1.age +
			"\nname=" + p1.name +
			"\nsal=" + p1.sal +
			"\nisPass=" + p1.isPass);

	}
}


class Person {
	int age;
	String name;
	double sal;
	boolean isPass;
}