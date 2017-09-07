

/**
 * Created by djp4830 on 9/7/17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException{
        final String ANSI_RESET = "\u001B[0m";

        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.println(trafficLight.textColor() + trafficLight.color() + ANSI_RESET);
            Thread.sleep(trafficLight.duration());
        }
    }
}