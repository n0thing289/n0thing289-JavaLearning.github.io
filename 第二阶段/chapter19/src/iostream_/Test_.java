package iostream_;

public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFiles(10);
        bufferedReader.readFile();

        BufferedReader_ bufferedReader1 = new BufferedReader_(new StringReader_());
//        bufferedReader1.readStrings(10);
    }
}
