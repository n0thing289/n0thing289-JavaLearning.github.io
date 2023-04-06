package tempWork06;

public class Work06 {
    public static void main(String[] args) {
        Integer[][] arr = {
                {0,0,0,0,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0,1,0},
                {0,1,0,0,0,0,0,0,1,0},
                {0,2,0,0,0,0,0,0,1,1},
                {0,1,0,0,0,0,0,0,1,0},
                {0,1,1,1,1,1,1,0,1,0},
                {0,1,1,0,0,0,1,0,1,0},
                {0,1,1,0,0,0,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0},
        };
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    System.out.print(" # ");
                } else if (arr[i][j] == 1) {
                    System.out.print("   ");
                }else{
                    System.out.print(" @ ");
                }

            }
            System.out.println();
        }
    }
}
