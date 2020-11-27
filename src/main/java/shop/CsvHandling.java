package shop;

import java.io.*;
import java.util.ArrayList;

public class CsvHandling {

    /**
     *
     * Reads in ProductTypes from .csv file
     *
     * @return ArrayList of ProductTypes
     * @throws IOException
     */
    public ArrayList<ProductType> readProductTypesFromCSV() throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\geszt\\IdeaProjects\\works\\src\\main\\java\\shop\\valami.csv"));
        String[] elements;
        String row;
        ArrayList<ProductType> productList = new ArrayList<ProductType>();

        ProductType newType = new ProductType();
        while ((row = csvReader.readLine()) != null){
            elements = row.split(";");

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
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\geszt\\IdeaProjects\\works\\src\\main\\java\\shop\\producttype.csv"));
        String[] elements;
        String row;
        ArrayList<Product> productList = new ArrayList<Product>();
        Product newProduct = new Product();

        while ((row = csvReader.readLine()) != null){
            elements = row.split(";");

            newProduct.getType().setCategory(elements[0]);
            newProduct.getType().setBrand(elements[1]);
            newProduct.getType().setType(elements[2]);
            newProduct.getType().setPrice(Integer.parseInt(elements[3]));

            productList.add(new Product(newProduct));
        }
        csvReader.close();

        return productList;
    }

    /**
     *
     * Removes bought Products from registry
     *
     * @param productOutput ArrayList of still remaining Products
     * @throws IOException
     */
    public static void writeRemainingProducts(ArrayList<Product> productOutput) throws IOException {
        BufferedWriter csvWriter = new BufferedWriter(new FileWriter("C:\\Users\\geszt\\IdeaProjects\\works\\src\\main\\java\\shop\\product.csv"));

        ArrayList<String> outString = new ArrayList<String>();
        for (int i = 0; i < productOutput.size(); ++i) {
            csvWriter.write(productOutput.get(i).getType().getCategory() + ";" + productOutput.get(i).getType().getBrand() + ";" + productOutput.get(i).getType().getType() + ";" + productOutput.get(i).getType().getPrice() + "\n");
        }

        csvWriter.close();
    }
}
