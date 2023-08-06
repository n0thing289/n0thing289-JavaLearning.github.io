package chessItem;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class HorseChessBoard_Plus {
    private static int X = 10;
    private static int Y = 10;
    private static int[][] chessBoard = new int[Y][X];
    private static boolean[] visited = new boolean[Y * X];
    private static boolean finished = false;

    public static void main(String[] args) {
        //初始坐标
        int row = 5;
        int col = 5;

        long start = System.currentTimeMillis();
        traversalChessBoard(chessBoard,row-1,col-1,1);
        long end = System.currentTimeMillis();

        System.out.println("遍历耗时:" + (end - start));
        for (int[] rows : chessBoard) {
            for (int step : rows) {
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }

    //编写一个方法，可以根据当前位置计算其他可以走的位置
    public static ArrayList<Point> next(Point curPoint) {
        ArrayList<Point> points = new ArrayList<>();

        //创建一个点,准备放入
        Point point = new Point();

        //判断curPoint是否可以走如下位置,如果可以走,就将该点放入ps

        //判断是否可以走5位置
        if ((point.x = curPoint.x - 2) >= 0 && (point.y = curPoint.y - 1) >= 0) {
            points.add(new Point(point));
        }
        //判断是否可以走6位置
        if ((point.x = curPoint.x - 1) >= 0 && (point.y = curPoint.y - 2) >= 0) {
            points.add(new Point(point));
        }
        //判断是否可以走7位置
        if ((point.x = curPoint.x + 1) < X && (point.y = curPoint.y - 2) >= 0) {
            points.add(new Point(point));
        }
        //判断是否可以走0位置
        if ((point.x = curPoint.x + 2) < X && (point.y = curPoint.y - 1) >= 0) {
            points.add(new Point(point));
        }
        //判断是否可以走1位置
        if ((point.x = curPoint.x + 2) < X && (point.y = curPoint.y + 1) < Y) {
            points.add(new Point(point));
        }
        //判断是否可以走2位置
        if ((point.x = curPoint.x + 1) < X && (point.y = curPoint.y + 2) < Y) {
            points.add(new Point(point));
        }
        //判断是否可以走3位置
        if ((point.x = curPoint.x - 1) >= 0 && (point.y = curPoint.y + 2) < Y) {
            points.add(new Point(point));
        }
        //判断是否可以走4位置
        if ((point.x = curPoint.x - 2) >= 0 && (point.y = curPoint.y + 1) < Y) {
            points.add(new Point(point));
        }
        return points;
    }

    //编写最核心的算法,遍历棋盘,如果遍历成功就把finished设置为true
    //并且把将马走的每一步记录到chessBoard
    public static void traversalChessBoard(int [][] chessBoard,int row,int col, int step){
        //先把step当前位置记录到chessBoard中
        chessBoard[row][col] = step;
        //把这个位置设置为以及访问
        visited[row * X + col] = true;
        //获取当前这个位置可以走哪些点
        ArrayList<Point> ps = next(new Point(col, row));
        sort(ps);
        //遍历
        while(!ps.isEmpty()){
            //取出ps第一个位置
            Point p = ps.remove(0);
            //判断当前位置是否走过,如果没有走过,我们就递归遍历
            if(!visited[p.y * X + p.x]){
                //递归遍历
                traversalChessBoard(chessBoard,p.y,p.x,step + 1);
            }
        }
        //看看是否遍历成功,如果没有成功,就重置相应的值,然后进行回溯
        if(step < X*Y && !finished){
            //重置
            chessBoard[row][col] = 0;
            visited[row * X + col]= false;
        }else{
            finished = true;
        }

        //写一个方法对ps进行排序,对ps的各个位置计算可以走的下一个位置的次数排序,把可能走的下一个位置从小到大排好

    }
    public static void sort(ArrayList<Point> ps){
        ps.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return next(o1).size() - next(o2).size();
            }
        });
    }
}
