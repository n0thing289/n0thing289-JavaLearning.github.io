import java.util.Scanner;
public class ArraySeqSearch{
	public static void main(String[] args){
		//思路分析
		//1.定义一个字符串列表
		//2.获取用户输入的字符串
		//3.遍历这个列表，并再过程中，判断我所输入的字符串
		//4.若找到到了，输出提示信息，若没有同样输出提示信息
		String[] arr = {"jack", "mark", "王权富贵", "林黛玉"};
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("请输入你要查找的内容：");
		String findname = my_scanner.next();
		boolean flag = false;
		for(int i=0;i<arr.length;i++){
			if(findname.equals(arr[i])){//常量在前，防止指针报错哇。
				System.out.println("找到了");
				System.out.println("下标为："+i);
				flag = true;
			}
		}
		if(!flag){
			System.out.println("没找到");
		}

	}
}