package Structural.Decorator.exp1;

public class TextDecorator implements Text{
    private Text decoratedText;
    public TextDecorator(Text decoratedText){
        this.decoratedText = decoratedText;
    }
    @Override
    public String render(){
        return decoratedText.render();
    }
}
