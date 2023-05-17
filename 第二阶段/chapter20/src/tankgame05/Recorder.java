package tankgame05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Recorder {
    private static int allEnemyTankNum = 0;

    //
    private static String filepath = "src\\tankgame05\\recordData.txt";

    private static FileWriter fw =null;
    private static BufferedWriter bw = null;
    public Recorder() throws IOException {
    }

    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static String getFilepath() {
        return filepath;
    }

    public static void setFilepath(String filepath) {
        Recorder.filepath = filepath;
    }

    public static FileWriter getFw() {
        return fw;
    }

    public static void setFw(FileWriter fw) {
        Recorder.fw = fw;
    }

    public static BufferedWriter getBw() {
        return bw;
    }

    public static void setBw(BufferedWriter bw) {
        Recorder.bw = bw;
    }
}
