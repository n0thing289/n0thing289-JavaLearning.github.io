package StringBuffer.Exercise;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//16

        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);// 传入了一个空值，引起空指针
        System.out.println(sb1);//null

        /**
         * 4
         * null
         * 报错
         */
    }
}
