package reflection.homework;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> fileCls = Class.forName("java.io.File");

        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> constructor :
                declaredConstructors) {
            System.out.println("File的构造器 = " + constructor);
        }


        File myFile = (File)fileCls.getDeclaredConstructor(String.class).newInstance("src\\reflection\\homework\\mynew.txt");

        Method declaredMethod = fileCls.getDeclaredMethod("createNewFile");
        declaredMethod.invoke(myFile);
    }
}

