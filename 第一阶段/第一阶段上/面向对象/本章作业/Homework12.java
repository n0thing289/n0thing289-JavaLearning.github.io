
public class Homework12{
	public static void main(String[] args){
		Employee e1 = new Employee("������", "��", 18, "�����ݹ���ʦ", 20000);
		Employee e2 = new Employee("joey", "��", 18);
		Employee e3 = new Employee("java����ʦ", 50000);
	}
}


class Employee{
	String name;
	String gender;
	int age;
	String position;
	int salary;

	public Employee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	public Employee(String position, int salary){
		this.position = position;
		this.salary = salary;
	}

	public Employee(String name, String gender, int age, String position, int salary){
		this(name, gender, age);
		this.position = position;
		this.salary = salary;
	}
}