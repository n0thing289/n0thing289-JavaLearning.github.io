package iostream_;

public class BufferedReader_ extends Reader_ {
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //为了让原本的节点流可用
    public void readFile(){
        reader_.readFile();
    }
    //为了让原本的节点流可用
    public void readString(){
        reader_.readString();
    }

    //模拟对节点流的方法进行拓展
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //模拟对节点流的方法进行拓展
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }

}
