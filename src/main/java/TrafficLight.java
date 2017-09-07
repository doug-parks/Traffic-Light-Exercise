/**
 * Created by djp4830 on 9/7/17.
 */
public enum TrafficLight {
    Stop("Red", 8, "\u001B[31m"),
    Go("Green", 6, "\u001B[32m"),
    Slow("Yellow", 2, "\u001B[33m");

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

    public TrafficLight getNextTrafficLight(TrafficLight e)
    {
        int index = e.ordinal();
        int nextIndex = index + 1;
        TrafficLight[] trafficLights = TrafficLight.values();
        nextIndex %= trafficLights.length;
        return trafficLights[nextIndex];
    }
}
