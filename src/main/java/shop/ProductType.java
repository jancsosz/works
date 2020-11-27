package shop;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ProductType {

    private String category;
    private String brand;
    private String type;
    private int price;
    //public ArrayList products = new ArrayList();

    public ProductType(){
        this.category = "";
        this.brand = "";
        this.price = 0;
        this.type = "";
    }
    public ProductType(ProductType init){
        this.category = init.category;
        this.brand = init.brand;
        this.price = init.price;
        this.type = init.type;
    }
}
