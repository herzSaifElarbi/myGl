package Creational.Builder.exp1;

public class Vehicule {
    private int seats;
    private int wheels;
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vihecule whith: "+this.seats+" seats and "+this.wheels+" wheels.";
    }
    
}
