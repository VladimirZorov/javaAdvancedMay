package JavaAdvancedExam25June2022;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();

        double[] milkValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        double[] cacaoValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        for (Double milkV : milkValue) {
            milk.offer(milkV);
        }

        for (Double cacaoV : cacaoValue) {
            cacao.push(cacaoV);
        }

        Map<String, Integer> chocolates = new TreeMap<>();
        chocolates.put("Milk Chocolate", 0);
        chocolates.put("Dark Chocolate", 0);
        chocolates.put("Baking Chocolate", 0);

        while (!milk.isEmpty() && !cacao.isEmpty()) {
            double milkPercentage = milk.peek();
            double cacaoPercentage = (cacao.peek() / (cacao.peek() + milk.peek()) * 100);
            switch ((int) cacaoPercentage) {
                case 30:
                    chocolates.computeIfPresent("Milk Chocolate", (k, v) -> v + 1);
                    milk.pop();
                    cacao.poll();
                    break;
                case 50:
                    chocolates.computeIfPresent("Dark Chocolate", (k, v) -> v + 1);
                    milk.pop();
                    cacao.poll();
                    break;
                case 100:
                    chocolates.computeIfPresent("Baking Chocolate", (k, v) -> v + 1);
                    milk.pop();
                    cacao.poll();
                    break;
                default:
                    cacao.poll();
                    milkPercentage+=10;
                    milk.pop();
                    milk.addLast(milkPercentage);
                    break;
            }

        }
        if (!chocolates.containsValue(0)) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            chocolates.entrySet().forEach(entry -> {
                System.out.println("# " + entry.getKey() + " --> " + entry.getValue());
            });
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            chocolates.entrySet().forEach(entry -> {
                if (entry.getValue()!=0)
                System.out.println("# " + entry.getKey() + " --> " + entry.getValue());
            });
        }
    }
}
