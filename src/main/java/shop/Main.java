package shop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //ArrayList<ProductType> productTypes = new ArrayList<ProductType>();
        ArrayList<Product> products = new ArrayList<Product>();
        CsvHandling test = new CsvHandling();

        try {
            products = test.readProductsFromCSV();
        }
        catch (FileNotFoundException e){
            System.out.println("A file nem található.");
        }
        catch (IOException e){
            System.out.println(e);
        }

//        for (int i = 0; i < products.size(); ++i){
//            System.out.println(products.get(i).getType().getCategory() + " " + products.get(i).getType().getBrand() + " " + products.get(i).getType().getType() + " " + products.get(i).getType().getPrice());
//        }

        Cart cart = new Cart();

        cart.addToCart(products.get(1));
        //products.remove(1);

        cart.addToCart(products.get(0));
        //products.remove(0);

        System.out.println("Kosarad tartalma: ");
        cart.listCart();
        System.out.println("----------------------");

        cart.transaction();

        try {
            CsvHandling.writeRemainingProducts(products);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(products.get(1).getType().getPrice());

//        Product p = new Product(productTypes.get(0));
//
//        Product p2 = new Product(productTypes.get(0));
//
//        System.out.println(p.getSerial() + " " + p2.getSerial());

    }
}
