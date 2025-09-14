package level1.model;

import level1.exceptions.VoidSaleException;
import level1.interfaces.Shop;
import level2.exceptions.*;
import level2.model.Input;

import java.util.ArrayList;

public class Sale implements Shop {

    private ArrayList<Product> products = new ArrayList<Product>();
    double totalValue=0.0;

    @Override
    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void addProducts() {
        String newProductName = Input.readString("Type the name of the new product");
        double newProductPrice = Input.readDouble("Type the price of the new product");
        Product newProduct = new Product(newProductName,newProductPrice);
        products.add(newProduct);
        System.out.println("Added new product: ");
        printProducts();
    }

    @Override
    public void fastAddProducts(String newProductName, double newProductPrice) {
        Product newProduct = new Product(newProductName,newProductPrice);
        products.add(newProduct);
        System.out.println("Added new product: ");
        printProducts();
    }

    @Override
    public void printProducts() {
        try{
            for (int i = 0; i <products.size() ; i++) {
                int index=i+1;
                System.out.println(index + " " + products.get(i).getName() + " " + products.get(i).getPrice());
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void removeProducts() throws VoidSaleException {
        if(products.isEmpty()){
            throw new VoidSaleException();
        }

        printProducts();
        int indexToDelete = Input.readInteger("Type the position in the last that you want to delete");
        indexToDelete--;
        products.remove(indexToDelete);
    }

    @Override
    public void calculateTotalValue() throws VoidSaleException {
        double accumulator=0;
        if(products.isEmpty()){
            throw new VoidSaleException();
        }

        try{
            for (int i = 0; i <products.size() ; i++) {
                accumulator= accumulator + products.get(i).getPrice();
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());

        }
        totalValue=accumulator;

        System.out.println("The combined value of all products is: " +totalValue);
    }
}
