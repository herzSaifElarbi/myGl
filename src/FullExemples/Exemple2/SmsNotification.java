package FullExemples.Exemple2;

public class SmsNotification implements INotificationStrategy{
    @Override
    public void send(String msg){
        System.out.println(msg+"via sms");
    }
}
