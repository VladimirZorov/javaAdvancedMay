package SetsAndMapsAdvancedLab;

import java.util.*;

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

            shop.putIfAbsent(store, new LinkedHashMap<>());
            shop.get(store).putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        shop.forEach((key, value) -> {
            System.out.printf("%s->%n", key);
            value.forEach((key1, value1) ->
                    System.out.printf("Product: %s, Price: %.1f%n", key1, value1));
        });
    }
}
