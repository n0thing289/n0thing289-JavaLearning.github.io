package reflection.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {

        Class<String> stringClass = String.class;
        Class<Serializable> serializableClass = Serializable.class;
        Class<Integer[]> aClass = Integer[].class;
        Class<float[][]> aClass1 = float[][].class;
        Class<Deprecated> deprecatedClass = Deprecated.class;
        //
        Class<Thread.State> stateClass = Thread.State.class;

        Class<Long> longClass = long.class;
        Class<Void> voidClass = void.class;
        Class<Class> classClass = Class.class;
    }
}
