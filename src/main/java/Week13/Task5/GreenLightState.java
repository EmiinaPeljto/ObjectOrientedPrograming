package Week13.Task5;

public class GreenLightState implements TrafficLightState{
    @Override
    public void transitionToGreen() {
        System.out.println("GREEN");
    }
    @Override
    public void transitionToYellow() {
        System.out.println("Switching to yellow");
    }
    @Override
    public void transitionToRed() {
        System.out.println("Switching to red");
    }
}
