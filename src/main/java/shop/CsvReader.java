package shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    /**
     *
     * Reads in ProductTypes from .csv file
     *
     * @return ArrayList of ProductTypes
     * @throws IOException
     */
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

    /**
     *
     * Reads in Products from .csv file
     *
     * @return ArrayList of Products
     * @throws IOException
     */
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

}
