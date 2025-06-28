package Creational.Builder.exp1;
public class App {
    public static void main(String[] args) throws Exception {
        Director director = new Director();
        director.setBuilder(new CarBuilder());
        director.constructCar();
        director.setBuilder(new MotocycleBuilder());
        director.constructMoto();
        

    }
}
