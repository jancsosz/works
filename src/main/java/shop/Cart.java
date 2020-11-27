package shop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cart = new ArrayList<Product>();


    public void addToCart(Product product){
        this.cart.add(product);
        System.out.println("Termék sikeresen hozzáadva! ");
        System.out.println("----------------------");
    }

    public void listCart() {

        for (int i = 0; i < cart.size(); ++i) {
            System.out.println(cart.get(i).getType().getBrand() + " " + cart.get(i).getType().getType() + " "  + cart.get(i).getType().getPrice());
        }
    }

    public ArrayList<Product> transaction(){
        System.out.println("Sikeresen megvásároltad a következő termékeket: ");

        listCart();

        System.out.println("\nVégösszeg: " + finalPrice() + " Ft");

        System.out.println("----------------------");

        //+ nyilvantartasbol kiszedni

        return this.cart;

        //this.cart.clear();

    }

    private int finalPrice(){

        return cart.stream()
                .map(x -> x.getType().getPrice())
                .reduce(0, (ans, i) -> ans + i);
    }

    public void clearCart(){
        this.cart.clear();
    }
}
