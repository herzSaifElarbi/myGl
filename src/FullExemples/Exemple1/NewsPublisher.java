package FullExemples.Exemple1;

public interface NewsPublisher {
    void subscribe(NewsSubscriber s);
    void unsubscribe(NewsSubscriber s);
    void notifySubscribers(String text);
}
