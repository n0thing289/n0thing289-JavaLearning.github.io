import java.util.Arrays;
import java.util.Comparator;

public class ArrayMethod01 {
    // Array.toString()
    //2. Array.sort()
    public static void main(String[] args) {



        Integer arr[] = {1,-1,7,0,89};
//        Arrays.sort(arr);
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        System.out.println("after..");
        System.out.println(Arrays.toString(arr));


    }
}
