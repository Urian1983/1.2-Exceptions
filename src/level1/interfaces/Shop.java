package level1.interfaces;

import level1.exceptions.VoidSaleException;
import level1.model.Product;

import java.util.ArrayList;

public interface Shop {

    ArrayList<Product> getProducts();
    void printProducts();
    void removeProducts() throws VoidSaleException;
    void addProducts();
    void fastAddProducts(String newProductName, double newProductPrice);
    void calculateTotalValue() throws VoidSaleException;

}
