package home13;



public class homework13 {

    public static void main(String[] args) {

        Student joey = new Student("joey", 'm', 20, 123456);
        Student Monica = new Student("Monica", 'w', 23, 135790);
        Teacher Ross = new Teacher("Ross", 'm', 25, 2);
        Teacher Chandler = new Teacher("Chandler", 'w', 30, 5);
        Person[] pArr = {joey,Monica,Ross,Chandler};

        //对多态数组排序,年龄由高到低
        //已封装到homework13方法中
        //遍历看效果,好神奇
        Person p = new Person();

        System.out.println("--------排序前----------");
        for(int a=0;a< pArr.length;a++){
            System.out.println(pArr[a].getName());
        }
        //这么麻烦??
        p.sortingPersonArr(pArr);
        System.out.println("--------排序后----------");
        for(int a=0;a< pArr.length;a++){
            System.out.println(pArr[a].getName());
        }

        for(int a=0;a< pArr.length;a++){
            p.showPerson(pArr[a]);
        }
    }
}
