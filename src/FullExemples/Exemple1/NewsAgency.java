package FullExemples.Exemple1;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsPublisher{
    private List<NewsSubscriber> subs;
    public NewsAgency(){
        this.subs = new ArrayList();
    }
    @Override
    public void subscribe(NewsSubscriber s){
        this.subs.add(s);
    }
    @Override
    public void unsubscribe(NewsSubscriber s){
        this.subs.remove(s);
    }
    @Override
    public void notifySubscribers(String text){
        for(NewsSubscriber s : subs){
            s.update(text);
        }
    }
}
