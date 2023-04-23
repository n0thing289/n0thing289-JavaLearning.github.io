package generic.cumstom_generic;

public class CustomGeneric {
}

//老汉解读
//1. Tiger后面泛型，所以我们把Tiger就称为自定义泛型类
//2. T,R,M 是泛型的标识符， 一般是单个大写字母
//3. 泛型标识符可以有多个
//4. 普通成员可以使用泛型(属性,方法,构造器)
//5. 使用泛型的数组不能初始化(因为new T[8], 数据类型不能确定,进而数据空间无法开辟)
//6. 静态成员不能用泛型(因为静态成员与类有关,与对象无关,所以在对象初始化前,就可以使用了,但是此时泛型类型还没有确定下来(对象定义的时候,泛型才能被确定))
//7. 如果定了了泛型,但是new的时候,我不写,默认是Object来填充
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }
    public void f(T t){
        System.out.println(t);
    }
}