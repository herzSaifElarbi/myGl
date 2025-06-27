package Behavioral.Observer.exp1;

public class User implements Subscriber{
    private String name;
    

    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(float temperature){
        System.out.println("User " + name + " received temperature update: " + temperature);
    }
}
