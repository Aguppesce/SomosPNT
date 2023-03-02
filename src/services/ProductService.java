package services;

import entities.Cosmetic;
import entities.Fruit;
import entities.Drink;
import entities.Product;

import java.util.ArrayList;

public class ProductService {

    private ArrayList<Product> productList = new ArrayList<>();

    public void loadProductList(ArrayList<Product> products) {

        Product p1 = new Drink("Coca-Cola Zero", 1.5, 20);
        Product p2 = new Drink("Coca-Cola", 1.5, 18);
        Product p3 = new Cosmetic("Shampoo Sedal", 500, 19);
        Product p4 = new Fruit("Frutillas", 64, "kilo");

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
    }

    public void showProducts(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.print(product);
        }
        System.out.println("=============================");
    }

    public void productExpensive(ArrayList<Product> products) {
        Product p = products.get(0);
        for (Product product : products) {
            if (product.compareTo(p) > 0) {
                p = product;
            }
        }
        System.out.println("Producto más caro: " + p.getName());
    }


    public void productCheaper(ArrayList<Product> products) {
        Product p = products.get(0);
        for (Product product : productList) {
            if (product.compareTo(p) < 0) {
                p = product;
            }
        }
        System.out.println("Producto más barato: " + p.getName());
    }

    public void mainMenu() {
        loadProductList(productList);
        showProducts(productList);
        productExpensive(productList);
        productCheaper(productList);
    }
}
