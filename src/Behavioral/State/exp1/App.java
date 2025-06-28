package Behavioral.State.exp1;

public class App {
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight(new RedState());
        tl.displayState();
        tl.changeState();
        tl.displayState();
        tl.changeState();
        tl.displayState();
        tl.changeState();
        tl.displayState();
        tl.changeState();
        tl.displayState();
        tl.changeState();
        tl.displayState();
        tl.changeState();
        tl.displayState();
    }
}
