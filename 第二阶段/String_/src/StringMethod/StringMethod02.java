package StringMethod;

public class StringMethod02 {
    public static void main(String[] args) {
        //1. toUpperCase 返回的结果是修改后的, 这个方法没有修改原来的旧引用,只是把处理后的字符串返回了
        String s = "hello";
        System.out.println(s.toUpperCase());//Hello
        //2. toLowerCase 返回的结果是修改后的, 这个方法没有修改原来的旧引用,只是把处理后的字符串返回了
        System.out.println(s.toLowerCase());

        //3. concat
        String s1 = "宝玉";
        s1 = s1.concat("零待遇").concat("薛宝钗").concat("together");
        System.out.println(s1);

        //4. replace 返回的结果是修改后的, 这个方法没有修改原来的旧引用,只是把处理后的字符串返回了
        s1 = "零待遇 零待遇 零待遇 零待遇";
        s1 = s1.replace("零待遇", "薛宝钗");
        System.out.println(s1);

        //5. split 分割字符串,对于某些分割符需要转义
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");

        System.out.println("===诗的内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        // 6. toCharArray() 转成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

        // 7. compareTo()
        // (1) 长度一样,每个字符一样,就返回0
        // (2) 长度一样,某同一索引的字符不相同,就返回c1 - c2 (目前看就是第一次出现不同的索引)
        // (2) 长度不同,字符前面部分相同, 就第一个字符串长度 - 第二个字符串长度
        String a = "jackjack";
        String b = "jack";
        System.out.println(a.compareTo(b));

        // 8. format 格式字符串
        // %s字符串 %c字符 %d整型 %.2f浮点型(保留小数点后两位,且会有四舍五入处理)
        String name = "john";
        int age = 10;
        double score = 100.607;
        char gender = '男';
        String info =
                "my name is " + name + "\tmy age is " + age + "\tmy score is " + score + "\tmy gender is" + gender;
        System.out.println(info);

        String formatStr = "我的姓名是%s 年龄是%d 成绩是%.2f 性别是%c 希望大家喜欢我";
        String info2 = String.format(formatStr, name,age,score,gender);
        System.out.println(info2);
        // compareTo 接口的方法


    }
}
