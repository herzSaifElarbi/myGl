package Behavioral.ChaineOfResponsability.exp1;

public abstract class BaseHandler implements IHandler{
    private BaseHandler next;
    @Override
    public BaseHandler setNext(BaseHandler next){
        this.next = next;
        return next;
    }
    @Override
    public void handle(int n){
        if(canHandle(n)){
            process(n);
        }else if(next != null){
            next.handle(n);
        }else{
            System.out.println("system can't handle it!");
        }
    }
    protected abstract boolean canHandle(int n);
    protected abstract void process(int n);
}
