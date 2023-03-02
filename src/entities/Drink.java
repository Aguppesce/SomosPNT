package entities;

public class Drink extends Product {

    //Attributes
    private double liters;

    //Constructor
    public Drink(String name, double liters, int price) {
        super(name, price);
        this.liters = liters;
    }

    //Methods
    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Litros: " + liters + " /// Precio: $" + this.getPrice() + "\n";
    }
}
