package review.temp;

public class Work02 {
    public static void main(String[] args) {
        new Clock().start();
    }
}
class Clock{
    private int hour = 0;
    private int minute = 0;
    private int s = 0;

    public void start(){
        while(true){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if(s != 59){
                s += 1;
            }else {
                s = 0;
                if(minute != 59){
                    minute += 1;
                }
                else{
                    minute = 0;
                    if (hour != 23){
                        hour += 1;
                    }
                    else {
                        hour = 0;
//                        break;
                    }
                }
            }
            System.out.println(hour +" : "+ minute +" : "+ s);
        }



    }
}