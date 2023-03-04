package interfaceDetail;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n3);// 说明接口中的属性是静态
//        IB.n3 = 10; // 报错说明接口中的属性是final

    }
}

class AAA implements IB,IC{

}

interface IB{
    int n3 = 100;
}
interface IC{

}