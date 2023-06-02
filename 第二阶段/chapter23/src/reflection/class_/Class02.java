package reflection.class_;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllpath = "reflection.class_.Car";

        //1.获取Car类对应的Class对象
        //<?> 表示不确定的java类型(泛型)
        Class<?> cls = Class.forName(classAllpath);
        //2. 输出cls
        System.out.println(cls);//显示cls对象,是哪一个类的class对象
        System.out.println(cls.getClass());//输出运行类型
        //3. 拿到包名
        System.out.println(cls.getPackage().getName());
        //4. 拿到全类名
        System.out.println(cls.getName());
        //5. 通过cls创建对象实例
        Car car = (Car)cls.newInstance();//jdk1.8弃用之后的替代方法是 cls.getDeclaredConstrucor（）.newInstance（）
        System.out.println(car.getClass());
        //6. 通过反射得到成员变量(在反射中万物(成员变量方法,构造器)皆对象)
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        //7. 通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));
        //8. 通过反射拿到所有属性
        Field[] fields = cls.getFields();
        for(Field f : fields){
            System.out.println(f.getName());//f.get(car)拿到的是每一个字段的值/f.getName()拿到所有属性名称
        }
    }
}
