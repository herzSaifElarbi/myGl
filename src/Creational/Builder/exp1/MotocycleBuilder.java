package Creational.Builder.exp1;

public class MotocycleBuilder implements IVehiculeBuilder{
    private Vehicule moto;
    @Override
    public Vehicule getVehicule(){
        Vehicule v = moto;
        this.reset();
        return v;
    }
    @Override
    public void reset(){
        this.moto = new Vehicule();
    }
    @Override
    public void setSeats(int seats){
        this.moto.setSeats(seats);
    }
    @Override
    public void setWheels(int wheels){
        this.moto.setWheels(wheels);
    }
}
