public class Homework02{
	public static void main(String[] args){
		//˼·����
		//����find�����������ַ�������
		//��find�ڲ�ȥ�������飬
		//����һ���������ڼ�¼��ǰ����
		//�����ж��Ƿ�Ϊ�û���Ҫ��
		//
		String[] arr = {"a","b","c","e","d"};
		A02 my_A02 = new A02();
		int res = my_A02.find("h", arr);
		if(res != -1){
			System.out.println(res);
		}
		else{
			System.out.println("��Ǹû���ҵ�");
		}
		
	}
}


class A02{

	public int find(String element, String[] str_arr){
		if(element != null && (str_arr != null && str_arr.length > 0)){
			for(int i=0;i<str_arr.length;i++){
				if(element.equals(str_arr[i])){
					return i;
				}
			}
		}
		return -1;
	}
}