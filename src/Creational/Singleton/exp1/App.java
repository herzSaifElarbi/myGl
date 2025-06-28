package Creational.Singleton.exp1;

public class App {
    public static void main(String[] args){
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        System.out.println("is it the same : "+ (logger1 == logger2) );
    }
}
