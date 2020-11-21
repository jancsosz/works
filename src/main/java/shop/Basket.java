package shop;

import java.util.ArrayList;

public class Basket {
    private ArrayList<ProductType> inTheBasket;


    public void addToBasket(ProductType product){
        this.inTheBasket.add(product);
    }

    public void listBasket() {
        System.out.println(inTheBasket);
    }

    public void transaction(){
        listBasket();
        //+ nyilvantartasbol kiszedni
    }

    private int finalPrice(){
        int price = 0;
        for(int i = 0; i < inTheBasket.size(); ++i){
            price += inTheBasket.get(i).getPrice();
        }
        return price;
    }
}
