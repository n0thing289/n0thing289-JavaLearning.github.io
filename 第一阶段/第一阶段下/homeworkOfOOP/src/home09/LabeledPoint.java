package home09;

public class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label,double x, double y){
        super(x,y);
        this.label = label;
    }
    public String show(){
        return label +','+ getX() +','+ getY();
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                '}';
    }
}
