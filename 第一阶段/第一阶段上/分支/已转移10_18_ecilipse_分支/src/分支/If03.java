import java.util.Scanner;
public class If03 {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("enter your marks:");
		double zhi_ma_fen = my_scanner.nextDouble();
		if (zhi_ma_fen == 100) {
			System.out.println("��������");

		}
		else if (zhi_ma_fen > 80 && zhi_ma_fen <= 99) {
			System.out.println("��������");

		}
		else if (zhi_ma_fen >= 60 && zhi_ma_fen <= 80) {
			System.out.println("����һ��");

		}
		else {
			System.out.println("���� ������");

		}

	}
}