public class Homework02{
	public static void main(String[] args){
		//思路分析
		//定义find方法，接送字符串数组
		//在find内部去遍历数组，
		//定义一个变量用于记录当前索引
		//并且判断是否为用户需要的
		//
		String[] arr = {"a","b","c","e","d"};
		A02 my_A02 = new A02();
		int res = my_A02.find("h", arr);
		if(res != -1){
			System.out.println(res);
		}
		else{
			System.out.println("抱歉没有找到");
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