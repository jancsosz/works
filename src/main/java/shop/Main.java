package shop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ProductType> productTypes = new ArrayList<ProductType>();
        CsvReader test = new CsvReader();

        try {
            productTypes = test.readProductTypesFromCSV();
        }
        catch (FileNotFoundException e){
            System.out.println("A file nem található.");
        }
        catch (IOException e){
            System.out.println(e);
        }

        for (int i = 0; i < productTypes.size(); ++i){
            System.out.println(productTypes.get(i).getCategory() + " " + productTypes.get(i).getBrand() + " " + productTypes.get(i).getType() + " " + productTypes.get(i).getPrice());
        }
    }
}
