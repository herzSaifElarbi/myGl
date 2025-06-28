package Behavioral.State.exp1;

public class TrafficLight {
    private IState state;
    public TrafficLight(IState state){
        this.setState(state);
    }
    public void setState(IState state){
        this.state = state;
    }
    public void changeState(){
        this.state.changeState(this);
    }
    public void displayState(){
        this.state.displayState();
    }
}
