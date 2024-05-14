public class Debug02 {
    public static void main(String[] args) {
        //看一下数组越界异常
        int[] arr = {1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("end...");
    }
}
