package Behavioral.ChaineOfResponsability.exp1;

public class HandlerC extends BaseHandler{
    @Override
    protected boolean canHandle(int n){
        return n<1000;
    }
    @Override
    protected void process(int n){
        System.out.println("Handled by C: " + n);
    }
    
}
