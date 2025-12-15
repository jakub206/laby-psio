package ex3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File fileData = new File("data/products.csv");
        ArrayList<Product> products = new ArrayList<>();
        HashMap<String, Double> pricesByCategory = new HashMap<>();
        HashMap<String, Integer> numProductsByCategory = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileData));
            String line;

            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String id = parts[0];
                String name = parts[1];
                String category = parts[2];
                double price = Double.parseDouble(parts[3]);

                products.add(new Product(id, name, category, price));
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        double totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }

        for(Product p : products){
            if(pricesByCategory.containsKey(p.getCategory())){
                double tmp =  pricesByCategory.get(p.getCategory());
                tmp = tmp + p.getPrice();
                pricesByCategory.put(p.getCategory(), tmp);
            } else {
                pricesByCategory.put(p.getCategory(), p.getPrice());
            }

            if(numProductsByCategory.containsKey(p.getCategory())){
                int tmp = numProductsByCategory.get(p.getCategory());
                tmp++;
                numProductsByCategory.put(p.getCategory(), tmp);
            } else {
                numProductsByCategory.put(p.getCategory(), 1);
            }
        }

        File fileResults = new File("data/report.txt");

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileResults));

            bw.write("Liczba produktów: "+products.size()+"\n");
            bw.write("Suma cen: "+totalPrice+"\n");
            bw.write("\n");

            for(HashMap.Entry<String, Double> entry : pricesByCategory.entrySet()){
                double avg = entry.getValue()/numProductsByCategory.get(entry.getKey());
                bw.write(entry.getKey()+" -> "+avg+"\n");
            }

            bw.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
