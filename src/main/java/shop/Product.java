package shop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private int serialNumber;
    private int count;
    private ProductType type;

    // Constuctors
    public Product(){
        this.type = new ProductType();
        //this.serialNumber = ;
    }

    public Product(Product prod){
        this.type = prod.type;
        //this.serialNumber = ;
    }

    public Product(ProductType type){
        //this.serialNumber = generateSerial();
        this.type = type;
    }

    /*private int generateSerial(){
        int serial;



        return serial;
    }*/
}
