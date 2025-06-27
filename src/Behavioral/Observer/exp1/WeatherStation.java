package Behavioral.Observer.exp1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private List<Subscriber> subscribers;
    private float state;
    public WeatherStation(float state) {
        this.subscribers = new ArrayList<>();
        this.state = state;
    }
    @Override
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }
    @Override
    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }
    @Override
    public void notifySubscribers(){
        for (Subscriber s : subscribers){
            s.update(state);
        }
    }
    public void setState(float state){
        this.state = state;
        this.notifySubscribers();
    }
}
