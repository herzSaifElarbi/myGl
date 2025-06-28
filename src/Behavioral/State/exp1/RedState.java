package Behavioral.State.exp1;

public class RedState implements IState{
    @Override
    public void displayState(){
        System.out.println("Red state!");
    }
    @Override
    public void changeState(TrafficLight tl){
        tl.setState(new GreenState());
    }
}
