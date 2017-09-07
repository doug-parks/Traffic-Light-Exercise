/**
 * Created by djp4830 on 9/7/17.
 */
public enum TrafficLight {
    Go("Green", 6000),
    Slow("Yellow", 2000),
    Stop("Red", 8000);

    private String color;
    private int duration;

    TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public String color(){
        return color;
    }
    public int duration(){
        return duration;
    }


}
