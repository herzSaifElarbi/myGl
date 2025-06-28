package Creational.Builder.exp1;

public class Director {
    private IVehiculeBuilder builder;
    public void setBuilder(IVehiculeBuilder builder){
        this.builder = builder;
    }
    public void constructCar(){
        Vehicule v;
        builder.reset();
        builder.setSeats(4);
        builder.setWheels(4);
        v = builder.getVehicule();
        System.out.println(v.toString());
    }

    public void constructMoto(){
        Vehicule v;
        builder.reset();
        builder.setSeats(1);
        builder.setWheels(2);
        v = builder.getVehicule();
        System.out.println(v.toString());
    }
}
