public class Exercise01 {

	public static void main(String[] args) {
		//����һ����ѭ����
		//����һ���ֽ��������һ�����ڼ�¼�����ı���
		//��ѭ����������if�ж��ֽ�����
		//��������ĳһ��ʱ������������Ҫ�˳�ѭ��break
		double cash = 100000.0;
		int i = 0;
		while(true){
			if(cash >= 50000){
				double short_cut = cash * 0.05;
				cash -= short_cut;
				i++;
			}
			else if(cash >= 1000){//�𰸴����������Ǵ����߼����ˣ���Ϊcash���ɸ����ˣ�һ��ʼ���Ǵ����㣬һ���为��
				cash -= 1000;
				i++;
			}
			
			else{
				break;
			}
			

		}
		System.out.println(i);//63������62
		System.out.println(cash);
	}
}