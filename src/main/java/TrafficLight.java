/**
 * Created by djp4830 on 9/7/17.
 */
public enum TrafficLight {

    Go("Green", 6000, "\u001B[32m"),
    Slow("Yellow", 2000, "\u001B[33m"),
    Stop("Red", 8000, "\u001B[31m");

    private String color;
    private int duration;
    private String textColor;

    TrafficLight(String color, int duration, String textColor){
        this.color = color;
        this.duration = duration;
        this.textColor = textColor;
    }

    public String color(){
        return color;
    }
    public int duration(){
        return duration;
    }
    public String textColor(){
        return textColor;
    }

}
