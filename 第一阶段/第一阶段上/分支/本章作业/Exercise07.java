public class Exercise07 {

	public static void main(String[] args) {
		//˼·����
		//���õ�a��A����ֵ
		//���������������ڼ�¼��ʼ��ֵ
		//��ѭ���У����������������������������
		char char_a = 'a';
		char char_A = 'Z';
		//System.out.println((int)(char_a));
		int int_a = (int)(char_a);//97 + 26 = 123
		//System.out.println((int)(char_A));
		int int_A = (int)(char_A);//65 + 26 = 91
		while(int_a < 123 && int_A >= 65){

			System.out.println("Сд��" + (char)(int_a) +
				"  ��д��" + (char)(int_A));
			int_a++;
			int_A--;
		}


		//��ʦ������
		//for(char c1 = 'a';c1<'z';c1++){
		//    System.out.print(c1)
		//}
		//for(char c1 = 'Z';c1 >= 'A';c1--){
		//    System.out.print(c1)
		//}
	}

}