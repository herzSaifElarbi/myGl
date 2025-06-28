package FullExemples.Exemple1;

public class User implements NewsSubscriber{
    private String name;
    private NotificationStrategy str;

    public User(String name) {
        this.name = name;
    }
    public void setStrategy(NotificationStrategy str){
        this.str = str;
    }
    @Override
    public void update(String text){
        System.out.println("user:" + this.name);
        str.execute(text);
    }

}