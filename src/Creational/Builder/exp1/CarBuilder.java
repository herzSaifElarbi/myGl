package Creational.Builder.exp1;

public class CarBuilder implements IVehiculeBuilder{
    private Vehicule car;
    @Override
    public Vehicule getVehicule(){
        Vehicule v = car;
        this.reset();
        return v;
    }
    @Override
    public void reset(){
        this.car = new Vehicule();
    }
    @Override
    public void setSeats(int seats){
        this.car.setSeats(seats);
    }
    @Override
    public void setWheels(int wheels){
        this.car.setWheels(wheels);
    }
}
