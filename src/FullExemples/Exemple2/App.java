package FullExemples.Exemple2;

public class App {
    public static void main(String[] args) {
        //files + decorators
        IFile myFile = new BasicFile("a test content!");
        System.out.println(myFile.render());
        myFile = new EncryptFile(myFile);
        System.out.println(myFile.render());
        myFile = new WaterFile(myFile);
        System.out.println(myFile.render());
        //users + strategies
        User u1 = new User("Saif", new SmsNotification());
        User u2 = new User("Secure", new EmailNotification());
        //notifier + observer
        FileNotifier fn = new FileNotifier();
        fn.subscribe(u1);
        fn.subscribe(u2);
        fn.nofifySubs(myFile);
    }
    
}
