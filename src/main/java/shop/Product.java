package shop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private int serial;
    private static int serialCount;
    private ProductType type;


    public Product(){
        this.type = new ProductType();
    }

    // for reading
    public Product(Product prod){

        this.type = new ProductType(prod.type);

        ++serialCount;
        this.serial = serialCount;

    }

    // for reading
    public Product(ProductType type){

        this.type = type;

        ++serialCount;
        this.serial = serialCount;

    }

    // for manual creation
    public Product(String category, String brand, String type, int price){
        this.type.setCategory(category);
        this.type.setBrand(brand);
        this.type.setType(type);
        this.type.setPrice(price);

        ++serialCount;
        this.serial = serialCount;
    }

}
