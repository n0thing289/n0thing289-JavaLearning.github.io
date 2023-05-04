package b_iostream_;

public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader = new BufferedReader_(new b_iostream_.FileReader_());
        bufferedReader.readFiles(10);
        bufferedReader.readFile();

        BufferedReader_ bufferedReader1 = new BufferedReader_(new b_iostream_.StringReader_());
//        bufferedReader1.readStrings(10);
    }
}
