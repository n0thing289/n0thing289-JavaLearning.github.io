
public class If05 {

	public static void main(String[] args) {
		
		
		int mouth = 12;
		int adult_age = 18;
		int kid_age = 6;
		int elder_age = 78;
		if (mouth >= 4 && mouth <= 10) {
			if (adult_age >= 18 && adult_age <= 60) {
				System.out.println("Íú¼¾£¬³ÉÈË40¿éÇ®");
			}
			if (kid_age < 18) {
				System.out.println("Íú¼¾£¬¶ùÍ¯°ë¼Û");
			}
			if (elder_age > 60) {
				System.out.println("Íú¼¾£¬ÀÏÈË1/3");
			}
		}
		else {
			if (adult_age >= 18 && adult_age <= 60) {
				System.out.println("µ­¼¾£¬³ÉÈË40¿éÇ®");

			}
			else {
				System.out.println("µ­¼¾£¬ÆäËû20¿éÇ®");
			}
		}

	}
}