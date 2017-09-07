import java.util.concurrent.TimeUnit;
/**
 * Created by djp4830 on 9/7/17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        final String ANSI_RESET = "\u001B[0m";

        while (true) {

            for (TrafficLight trafficLight : TrafficLight.values()) {

                String textColor = trafficLight.getNextTrafficLight(trafficLight).textColor();
                String color = trafficLight.getNextTrafficLight(trafficLight).color();
                String output = (textColor + color + ANSI_RESET);

                System.out.println(output);
                TimeUnit.SECONDS.sleep(trafficLight.duration());
            }
        }
    }
}