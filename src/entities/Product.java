package entities;

public abstract class Product implements Comparable<Product> {

    //Attributes
    protected String name;
    protected int price;

    //Constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p){
        if(this.getPrice() < p.getPrice()){
            return -1;
        }else if (this.getPrice() > p.getPrice()){
            return 1;
        } else{
            return 0;
        }
    }
}
