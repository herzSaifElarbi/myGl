package Creational.Builder.exp1;

public interface IVehiculeBuilder {
    Vehicule getVehicule();
    void setSeats(int seats);
    void setWheels(int wheels);
    void reset();
}
