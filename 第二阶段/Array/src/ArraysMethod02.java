import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};

        //1. binarySearch() 二叉查找
        //2. 注意: 必须是有序数组,不管从大到小还是从小到大
        int index = Arrays.binarySearch(arr,568);// 568 返回的是居然是-6
        //3. 如果数组不存在该元素,就返回return -(low + 1); low是应该在的索引
        //      也就是说 把应该在的位置+1 然后取负数返回
        System.out.println(index);


        // copyOf
        // 1, 从arr数组中,拷贝arr.length个元素到newArr数组中
        // 2, 如果拷贝的长度大于arr.length 就在新数组后面 增加null
        // 3, 如果拷贝的长度小于0, 就会抛出异常NegativeArraySizeException
        // 4, 该方法底层使用的是System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("==拷贝完成后");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        // 将原来的数组全部填充成99
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num, 99);
        System.out.println("==num数组填充后==");
        System.out.println(Arrays.toString(num));//[99, 99, 99]

        //equals
        boolean equals = arr.equals(newArr);
        System.out.println("==equals==");
        System.out.println(equals);

        //asList 将一组值转换成list
        // 1. asList方法将(2,3,4,5,6,1)数据转成一个List集合
        //2. 返回的asList编译类型List(接口)
        //3. asList的运行类型class java.util.Arrays$ArrayList 是Arrays的静态内部类
        List<Integer> asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList的运行类型" + asList.getClass());
    }
}
