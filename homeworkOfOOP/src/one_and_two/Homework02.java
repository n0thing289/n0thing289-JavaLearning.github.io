package one_and_two;

public class Homework02 {
    public int i1 = 100;
    protected int i2 = 200;
    int i3 = 300;
    private int i4 = 400;
}
class Test{
    public int i1 = 100;
    protected int i2 = 200;
    int i3 = 300;
    private int i4 = 400;
}
/*
    private 只能当前类用，不能修饰类
    默认 只能在当前包下的所有类可见
    protected 当前包下所有类以及所有子类（包括不同包下的子类）可见
    public 哪里都能用
 */
