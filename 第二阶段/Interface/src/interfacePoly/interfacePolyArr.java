package interfacePoly;

public class interfacePolyArr {
    public static void main(String[] args) {

        // 第二部分多态数组 -> 接口数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();  // 这里注意,这个数组的编译是Usb类型,我们知道数组是连续申请了编译类型为Usb的变量
        // 接口的引用指向实现了接口的类的对象实例
        usbs[1] = new Camera_();  //接口的引用指向实现了接口的类的对象实例

        for(int i = 0;i<usbs.length;i++){
            usbs[i].start();
            usbs[i].stop();
            if(usbs[i] instanceof Phone_){// 所以这里要用到向下转型,
                // 因为Camera没有call的方法,要类型判断,
                // 但是每个数组元素的编译类型是usb,
                // 直接写call方法是没有用的,
                // (向上转型时,没有重写的方法会丢失,向下转型后才能访问)
                ((Phone_) usbs[i]).call();
            }
        }
    }
}
