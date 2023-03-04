package interfaceDetail.test;

import interfaceDetail.tryAccess2;

public class tryAccess implements tryAccess2 {
    public static void main(String[] args) {
        System.out.println(tryAccess2.n10); // 居然挎包访问了属性,说明接口中的属性是公共的
    }
}
