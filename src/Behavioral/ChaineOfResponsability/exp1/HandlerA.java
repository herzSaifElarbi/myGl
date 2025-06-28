package Behavioral.ChaineOfResponsability.exp1;

public class HandlerA extends BaseHandler{
    @Override
    protected boolean canHandle(int n){
        return n < 10;
    }
    @Override
    protected void process(int n){
        System.out.println("Handled by A: " + n);
    }
}
