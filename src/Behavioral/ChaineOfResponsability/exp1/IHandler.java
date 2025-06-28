package Behavioral.ChaineOfResponsability.exp1;

public interface IHandler {
    BaseHandler setNext(BaseHandler next);
    void handle(int n);
}
