import java.util.Scanner;
public class ArraySeqSearch{
	public static void main(String[] args){
		//˼·����
		//1.����һ���ַ����б�
		//2.��ȡ�û�������ַ���
		//3.��������б����ٹ����У��ж�����������ַ���
		//4.���ҵ����ˣ������ʾ��Ϣ����û��ͬ�������ʾ��Ϣ
		String[] arr = {"jack", "mark", "��Ȩ����", "������"};
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ����ݣ�");
		String findname = my_scanner.next();
		boolean flag = false;
		for(int i=0;i<arr.length;i++){
			if(findname.equals(arr[i])){//������ǰ����ָֹ�뱨���ۡ�
				System.out.println("�ҵ���");
				System.out.println("�±�Ϊ��"+i);
				flag = true;
			}
		}
		if(!flag){
			System.out.println("û�ҵ�");
		}

	}
}