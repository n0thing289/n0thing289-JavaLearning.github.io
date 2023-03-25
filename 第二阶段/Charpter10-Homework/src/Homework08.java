public class Homework08 {
    public static void main(String[] args) {
        Color.RED.show();
        Color.BLACK.show();


        switch(Color.BLACK){
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
        }
    }
}
enum Color implements IA{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    ;
    private int redValue;
    private int greenValue;
    private int blueValue;
    private Color(int redValue, int greenValue, int blueValue){
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show(){
        System.out.println("red: " + redValue + "  green: " + greenValue + "  blue: " + blueValue);
    }
}

interface IA{
    public void show();
}