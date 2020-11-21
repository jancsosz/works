package shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public ArrayList<ProductType> readProductTypesFromCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("/home/janos/Dokumentumok/epam/webshop/src/main/java/shop/proba.csv"));
        String[] elements;
        String row;
        ArrayList<ProductType> productList = new ArrayList<ProductType>();

        ProductType newType = new ProductType();
        while ((row = csvReader.readLine()) != null){
            elements = row.split(",");

            newType.setCategory(elements[0]);
            newType.setBrand(elements[1]);
            newType.setType(elements[2]);
            newType.setPrice(Integer.parseInt(elements[3]));

            productList.add(new ProductType(newType));
        }
        csvReader.close();

        return productList;
    }

    public ArrayList<Product> readProductsFromCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("/home/janos/Dokumentumok/epam/webshop/src/shop/proba1.csv"));
        String[] elements;
        String row;
        ArrayList<Product> productList = new ArrayList<Product>();
        Product newProduct = new Product();

        while ((row = csvReader.readLine()) != null){
            elements = row.split(",");

            newProduct.getType().setCategory(elements[0]);
            newProduct.getType().setBrand(elements[1]);
            newProduct.getType().setType(elements[2]);
            newProduct.getType().setPrice(Integer.parseInt(elements[3]));

            productList.add(new Product(newProduct));
        }
        csvReader.close();

        return productList;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<ProductType> productTypes = new ArrayList<ProductType>();
        Main test = new Main();

        productTypes = test.readProductTypesFromCSV();

        for (int i = 0; i < productTypes.size(); ++i){
            System.out.println(productTypes.get(i).getCategory() + " " + productTypes.get(i).getBrand() + " " + productTypes.get(i).getType() + " " + productTypes.get(i).getPrice());
        }
    }
}
