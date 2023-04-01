package StringBuffer;

public class StringBuffer02 {
    public static void main(String[] args) {
        // 字符串是存储再父类AbstractStringBuilder的value（在堆中）
        //1.
        StringBuffer stringBuffer = new StringBuffer();
        //2. 指定字符容量（长度）
        StringBuffer stringBuffer2 = new StringBuffer(100);

        //3. 通过给一个string来指定字符数组char[]的长度(string的长度＋16)以此创建StringBuilder
        StringBuffer hello = new StringBuffer("hello");
    }
}
