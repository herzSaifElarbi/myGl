package Behavioral.Observer.exp1;
public class App {
    public static void main(String[] args) throws Exception {
        WeatherStation ws = new WeatherStation(30);
        User u1 = new User("Saif");
        User u2 = new User("Secure");
        ws.subscribe(u1);
        ws.subscribe(u2);
        ws.setState(40);
    }
}
