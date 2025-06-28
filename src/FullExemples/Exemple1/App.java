package FullExemples.Exemple1;
public class App {
    public static void main(String[] args) throws Exception {
        NewsAgency na = new NewsAgency();
        User u1 = new User("secure");
        User u2 = new User("saif");
        u1.setStrategy(new SmsNews());
        u2.setStrategy(new EmailNews());
        na.subscribe(u1);
        na.subscribe(u2);
        na.notifySubscribers("news break!");
        
    }
}
