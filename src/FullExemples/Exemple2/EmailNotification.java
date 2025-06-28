package FullExemples.Exemple2;

public class EmailNotification implements INotificationStrategy{
    @Override
    public void send(String msg){
        System.out.println(msg + "via email");
    }

}
