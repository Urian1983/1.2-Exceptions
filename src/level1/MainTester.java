package level1;

import level1.exceptions.VoidSaleException;
//import level1.model.Product;
import level1.model.Sale;
import level2.model.Input;

public class MainTester {

    private static Sale fruitShop;

    public static void main(String[] args) {

        fruitShop = new Sale();
        addFullShop();
        menu();
    }

    private static String printMenu() {
        return "\n--- Sale Menu ---\n" +
                "1. Add product\n" +
                "2. Remove product\n" +
                "3. Print products\n" +
                "4. Calculate total value\n" +
                "5. Exit\n";
    }

    private static int menu() {
        while(true){
            String textMenu= printMenu();

            byte optionMenu = Input.readByte(textMenu);

            switch(optionMenu){
                case 1:
                    fruitShop.addProducts();
                    break;
                case 2:
                    try {
                        fruitShop.removeProducts();
                    } catch (VoidSaleException e) {
                        System.err.println("Cannot remove product: Sale is empty.");
                    }
                    break;
                case 3:
                    fruitShop.printProducts();
                    break;
                case 4:
                    try {
                        fruitShop.calculateTotalValue();
                    } catch (VoidSaleException e) {
                        System.err.println("Cannot calculate total: Sale is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Thanks for all.");
                    return 0;
                default:
                    System.out.println("Choose a valid option in the menu");
                    break;
            }
        }

    }

    public static void addFullShop() {
        fruitShop.fastAddProducts("Apple", 1.5);
        fruitShop.fastAddProducts("Banana", 0.8);
        fruitShop.fastAddProducts("Orange", 1.2);
        fruitShop.fastAddProducts("Grapes", 2.0);
        fruitShop.fastAddProducts("Strawberry", 3.0);
        System.out.println("Shop initialized with fruits.");
    }




}
