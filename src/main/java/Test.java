

/**
 * Created by djp4830 on 9/7/17.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException{

        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.println(trafficLight.color());
            Thread.sleep(trafficLight.duration());
        }
    }
}
