package FullExemples.Exemple1;

public class SmsNews implements NotificationStrategy{
    @Override
    public void execute(String text){
        System.out.println(text + "via SMS");
    }
}
