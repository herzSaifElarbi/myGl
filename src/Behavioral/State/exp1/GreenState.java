package Behavioral.State.exp1;

public class GreenState implements IState{
    @Override
    public void displayState(){
        System.out.println("Green state!");
    }
    @Override
    public void changeState(TrafficLight tl){
        tl.setState(new OrangeState());
    }
}
