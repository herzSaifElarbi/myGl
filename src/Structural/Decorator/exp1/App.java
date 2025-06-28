package Structural.Decorator.exp1;
public class App {
    public static void main(String[] args) throws Exception {
        Text myText = new PlainText("SaifSecure");
        String test  = myText.render();
        System.out.println(test);
        myText = new BoldText(myText);
        test  = myText.render();
        System.out.println(test);
        myText = new ItalicText(myText);
        test = myText.render();
        System.out.println(test);
    }
}
