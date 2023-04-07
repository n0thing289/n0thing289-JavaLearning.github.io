public class Homework04 {
    public static void main(String[] args) {
        String str = "Hwk2892734127";
        account(str);
    }

    public static void account(String str){
        //1. 接受str,并转为char数组,方便后面用Character的类方法
        char[] chars = str.toCharArray();
        //2. 检测循环的变量,for循环字符串,每个字符都遍历一下,用一些方法
        //
        int countUpperChar = 0;
        int countLowerChar = 0;
        int countDigitChar = 0;
        for (int i = 0; i < chars.length; i++) {
//            Character c = chars[i];
            //每个字符都检查是不是大写,有一个就加一个
            if(Character.isUpperCase(chars[i])){
                countUpperChar++;
            } else if (Character.isLowerCase(chars[i])) {
                countLowerChar++;
            } else if (Character.isDigit(chars[i])) {
                countDigitChar++;
            }
        }
        System.out.println(
                "大写字母有: " + countUpperChar +
                "\n小写字母有: " + countLowerChar +
                "\n数字有: " + countDigitChar);
    }
}
/**
 * 老韩思路, 没有用字符数组和Character方法
 * 1. 遍历字符串,如果char在 0~9 就是一个数字
 * 2. 如果char是在 'a' ~ 'z' 之间就是一个小写字母
 * 3. 如果char是在 'A' ~ 'Z' 之间就是一个大写字母
 */
