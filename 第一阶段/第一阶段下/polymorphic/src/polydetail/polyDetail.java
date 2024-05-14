package polydetail;

public class polyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Object obj = new Cat();

        //1. 向上转型
//        animal.catchMouse();//先编译，而编译时是由编译类型决定能够调用那些成员
        animal.run();
        animal.jump();
        animal.show();
        animal.sleep();

        //2. 向下转型，我想用子类的特有的成员怎么办？

        //语法如下
        Cat cat = (Cat) animal;
        cat.name = "cat";
        System.out.println(cat.name);
        cat.catchMouse();

        //注意，你父类的引用必须原本就指向了我想要转成子类的对象
        //Dog dog = (Dog) animal//错误！，animal原本指向的是猫类
//        int[] arrOld = {1,2,3,4,5};
//        int[] arrNew = new int[5];
//        for(int i = arrOld.length-1;i>=0;i--){
//            arrNew[4-i] = arrOld[i];
//
//        }
//
//
//        for(int i = 0;i<arrNew.length;i++){
//            System.out.println(arrNew[i]);
//        }


    }
}
