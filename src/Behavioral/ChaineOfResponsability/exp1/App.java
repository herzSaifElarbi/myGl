package Behavioral.ChaineOfResponsability.exp1;

public class App {
    public static void main(String[] args) {
        BaseHandler h1 = new HandlerA();
        BaseHandler h2 = new HandlerB();
        BaseHandler h3 = new HandlerC();
        h1.setNext(h2).setNext(h3);
        h1.handle(5);
        h1.handle(15);
        h1.handle(150);
    }
}
