package Inheritence;

public class Point {
    private double xChord;
    private double yChord;

    public Point(){
        xChord = 1;
        yChord = 1;
    }

    public void setChords(double x, double y){
        xChord = x;
        yChord = y;
    }

    public double getxChord(){
        return xChord;
    }

    public double getyChord(){
        return yChord;
    }
}
