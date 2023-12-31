package Week13.Task5;

public class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToYellow() {
        System.out.println("YELLOW");
    }
    @Override
    public void transitionToGreen() {
        System.out.println("Switching to green.");
    }
    @Override
    public void transitionToRed() {
        System.out.println("Switching to red");
    }
}
