package SetsAndMapsAdvancedLab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shop = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String [] commands =  input.split(", ");
            String store = commands[0];
            String product = commands[1];
            double price = Double.parseDouble(commands[2]);

            shop.putIfAbsent(store, new TreeMap<>());
            shop.get(store).putIfAbsent(product, price);

            input = scanner.nextLine();
        }



        System.out.println();
    }
}
