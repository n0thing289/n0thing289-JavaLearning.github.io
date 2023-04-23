package generic.cumstom_generic;

public class CustomInterfaceGeneric {

}

/**
 * 泛型接口使用的说明
 * 1. 在接口中,静态成员也不能使用泛型
 * 2. 泛型接口的类型,是在继承或者实现的时候取确定的
 * 3. 没有指定类型,默认为Object
 */
interface IUsb<U, R>{
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中,可以在接口中使用默认方法,这个可以使用泛型
    default R method(U u){
        return null;
    }
}
interface IA extends IUsb<String, Double>{

}

//当我们取实现IA接口时,因为IA在继承IUsb接口指定了U为String,R为Double
//  所以在实现IUsb接口方法的时候,会自动地进行填充
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

//当直接去实现时,传给泛型地具体类型是一样地进行替换Integer替换U, Float替换R
class BB implements IUsb<Integer, Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

//当没有给泛型指定数据类型时,默认用Object填充
class CC implements IUsb{

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}