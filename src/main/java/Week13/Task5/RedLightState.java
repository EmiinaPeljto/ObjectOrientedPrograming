package Week13.Task5;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed() {
        System.out.println("RED");
    }
    @Override
    public void transitionToYellow() {
        System.out.println("Switching to yellow.");
    }
    @Override
    public void transitionToGreen() {
        System.out.println("Switching to green.");
    }
}
