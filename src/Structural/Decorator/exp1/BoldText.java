package Structural.Decorator.exp1;

public class BoldText extends TextDecorator{
    public BoldText(Text text){
        super(text);
    }
    @Override
    public String render(){
        return "<b>"+super.render()+"</b>";
    }    
}
