package entities;

public class Cosmetic extends Product {

    //Attributes
    private int content;

    //Constructor
    public Cosmetic(String name, int content, int price) {
        super(name, price);
        this.content = content;
    }

    //Methods
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getName() + " /// Contenido: " + content +"ml" + " /// Precio: $" + this.getPrice() + "\n";
    }
}
