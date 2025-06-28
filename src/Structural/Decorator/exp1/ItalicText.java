package Structural.Decorator.exp1;

public class ItalicText extends TextDecorator{
    public ItalicText(Text text){
        super(text);
    }
    @Override
    public String render(){
        return "<i>"+super.render()+"</i>";
    }
    
}
