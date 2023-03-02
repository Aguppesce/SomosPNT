package entities;

public class Fruit extends Product {

    //Attributes
    private String salesUnit;

    //Constructor
    public Fruit(String name, int price, String salesUnit) {
        super(name,price);
        this.salesUnit = salesUnit;
    }

    //Methods
    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Precio: $" + this.getPrice() + " /// Unidad de venta: " + salesUnit + "\n";
    }
}
