package FullExemples.Exemple1;

public class EmailNews implements NotificationStrategy {
    @Override
    public void execute(String text){
        System.out.println(text + "via Email");
    }
}
