public class Homework03{
	public static void main(String[] args){
		Book book1 = new Book("a",250);
		Book book2 = new Book("b", 150);
		Book book3 = new Book("c", 100);


		System.out.println(book1.name + "这本书目前价格：" + book1.price);
		System.out.println(book2.name + "这本书目前价格：" + book2.price);
		System.out.println(book3.name + "这本书目前价格：" + book3.price);

		book1.updatePrice();
		book2.updatePrice();
		book3.updatePrice();

		System.out.println(book1.name + "这本书目前价格：" + book1.price);
		System.out.println(book2.name + "这本书目前价格：" + book2.price);
		System.out.println(book3.name + "这本书目前价格：" + book3.price);

	}
}


class Book{
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}


	public void updatePrice(){
		if(this.price > 150){
			System.out.println(this.name + "已降至150￥");
			this.price = 150;
		}
		else if(this.price > 100){
			System.out.println(this.name + "已降至100￥");
			this.price = 100;	
		}
	}
}