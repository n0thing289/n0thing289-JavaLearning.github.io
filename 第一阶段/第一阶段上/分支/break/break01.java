public class break01 {

	public static void main(String[] args) {
		while(true){
			int i = (int)(Math.random() * 100 + 1);
			System.out.println(i);
			if(i == 97){
				System.out.println("pause");
				break;
			}

		}
	}
}