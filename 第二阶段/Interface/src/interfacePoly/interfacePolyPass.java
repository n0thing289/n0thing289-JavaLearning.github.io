package interfacePoly;

public class interfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        IH ih = new Teacher();// 1. 如果爸爸接口继承了爷爷接口,儿子类实现爸爸接口时相当于也实现了爷爷接口


    }
}
// 接口多态传递,
// 1. 如果爸爸接口继承了爷爷接口,儿子类实现爸爸接口时相当于也实现了爷爷接口
// 2. 爷爷接口的抽象方法会一直继承下去,直到儿子类去实现
interface IH{
    void hi();
}
interface IG extends IH{}
class Teacher implements IG{
    public void hi(){
        // 2. 爷爷接口的抽象方法会一直继承下去,直到儿子类去实现
    }
}