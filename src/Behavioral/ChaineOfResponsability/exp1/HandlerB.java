package Behavioral.ChaineOfResponsability.exp1;

public class HandlerB extends BaseHandler{
    @Override
    protected boolean canHandle(int n){
        return n<100;
    }
    @Override
    protected void process(int n){
        System.out.println("Handled by B: " + n);
    }
    
}
