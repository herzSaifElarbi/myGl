package Behavioral.State.exp1;

public class OrangeState implements IState{
    @Override
    public void displayState(){
        System.out.println("Orange state!");
    }
    @Override
    public void changeState(TrafficLight tl){
        tl.setState(new RedState());
    }
}
