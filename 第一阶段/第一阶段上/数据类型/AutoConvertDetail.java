public class AutoConvertDetail {
	public static void main(String[] args) {
		//细节1 有多种类型的数据混合运算时，
		//系统首先自动将所有的数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		float d1 = n1 + 1.1;//错误，因为1.1是浮点型（浮点型默认是double类型），此时运算结果会变成精度最大的double类型
		//double d1 = n1 + 1.1;//对，
		float d2 = n1 + 1.1f;//对 运算结果类型是float

		//细节二：当我们把精度大的数据类型赋值给小精度数据类型时，就会报错，反之进行数据转换
	    
	    //int n2 = 1.1;//错误，1.1是默认是double double不能转成int
	    
	    //细节三：byte，short，和char之间不会相互自动转换
	    //当把具体数赋给 byte时 先判断该数是否在byte的范围内，如果是就可以
		byte b1 = 10;//理解老师说的蒙圈是什么意思了，在这里10是整形（整形默认是int类型，
		             //而int类型是比byte精度高，理应不能转，
		             //但是解释器在这种情况（10没有被任何一个变量存）是先判断范围，而不是上来就判断变量类型）
		int n2 = 1;
		//byte b2 = n2;//如果是赋数值是判断范围，如果是赋变量直接判断数据类型能不能转
	    //上面的底层逻辑图在word
	    
	    //
	    char c1 = b1;//错误 byte short char之间不

	    //细节四：byte，short，char，他们三者可以计算，在计算时首先转换为int
	    byte b2 = 1;
	    short s1 = 1;
	    //short s2 = b2 + s1;//c错，b2 + s1精度都会变成int

	    //测试
	    byte b3 = 2;
	    //byte b4 = b2 + b3;//错，只要是byte short char一经运算，无论单个同个还是多个，最后都是int

	    //boolean 不参与转换
	    boolean pass = true;
	    //int num100 = pass;//错
	    //
	    //自动提升原则：表达式结果的类型自动提升为 操作数中最大的那个类型
	    //看一道题
	    byte b4 = 1;
	    short s3 = 100;
	    int num200 = 1;
	    float num300 = 1.1f;

	    float num500 = b4 + s3 + num200 + num300;



	    
	    
	}


}