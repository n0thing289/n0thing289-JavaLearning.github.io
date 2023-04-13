package tempWork;

public class Work04 {
    public static void main(String[] args) {
        juZhen(3, 3);
        System.out.println("");
        juZhen(5, 5);
        System.out.println("");
        juZhen(8, 8);
    }

    public static void juZhen(int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
