package tankgame06;

import java.io.*;
import java.util.Vector;

public class Recorder {
    private static int allEnemyTankNum = 0;

    //
    private static String filepath = "src\\recordData.txt";

    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static Vector<EnemyTank> enemyTanks = null;

    //恢复敌人信息用的变量
    private static Vector<Node> nodes = new Vector<>();
    public Recorder() throws IOException {
    }

    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static void keepRecord() {
        try {
            fw = new FileWriter(filepath);
            bw = new BufferedWriter(fw);
            String str = "" + allEnemyTankNum;
            bw.write(str, 0, str.length());
            bw.newLine();

            //接下来就是要保存敌人的坐标
            //1. 循环判断敌人的Vector
            //2. 判断是否活着
            //3. 便利每一个敌人的坐标和方向
            int x;
            int y;
            int direct;
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank currentEnemyTank = enemyTanks.get(i);
                if (currentEnemyTank.isLive()) {
                    x = currentEnemyTank.getX();
                    y = currentEnemyTank.getY();
                    direct = currentEnemyTank.getDirect();

                    String tankstr = x + " " + y + " " + direct;
                    bw.write(tankstr);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static Vector<Node> readRecord() {
        String read = null;

        int deadEnemyTankSize = -1;
        int x, y, direct;
        nodes = new Vector<>();
        try {
            br = new BufferedReader(new FileReader(filepath));
            String str;
            while ((str = br.readLine()) != null) {
                if (deadEnemyTankSize == -1) {
                    System.out.println(str);
                    deadEnemyTankSize = Integer.parseInt(str);
                    continue;
                }
                String[] s = str.split(" ");
                System.out.println(str);
                x = Integer.parseInt(s[0]);
                y = Integer.parseInt(s[1]);
                direct = Integer.parseInt(s[2]);

//                EnemyTank enemyTank = new EnemyTank(x, y);
//                enemyTank.setDirect(direct);
                Node node = new Node(x,y,direct);
                nodes.add(node);
            }
        }catch (FileNotFoundException e){
            System.out.println("没有继续上局的记录, 新游戏开始");
//            System.exit(0);//如果没有记录文件,就直接关闭程序
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        MyPanel.setDeadEnemyTankSize(deadEnemyTankSize);
        return nodes;
    }
}
