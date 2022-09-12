package JavaAdvancedRetakeExam18August2021;

import java.util.*;

public class Pastryshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liquids = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] ingredients = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liquidSteack = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientQueue = new ArrayDeque<>();

        for (int liq : liquids) {
            liquidSteack.offer(liq);
        }
        for (int ing : ingredients) {
            ingredientQueue.push(ing);
        }

        Map<String, Integer> food = new LinkedHashMap<>();

        food.put("Biscuit", 0);
        food.put("Cake", 0);
        food.put("Pie", 0);
        food.put("Pastry", 0);

        while (!liquidSteack.isEmpty() && !ingredientQueue.isEmpty()) {
            int liquidToCook = liquidSteack.peek();
            int ingredientToCook = ingredientQueue.peek();

            int valueNeeded = liquidToCook + ingredientToCook;

            switch (valueNeeded) {
                case 25:
                    food.computeIfPresent("Biscuit", (k, v) -> v + 1);
                    liquidSteack.pop();
                    ingredientQueue.poll();
                    break;
                case 50:
                    food.computeIfPresent("Cake", (k, v) -> v + 1);
                    liquidSteack.pop();
                    ingredientQueue.poll();
                    break;
                case 75:
                    food.computeIfPresent("Pastry", (k, v) -> v + 1);
                    liquidSteack.pop();
                    ingredientQueue.poll();
                    break;
                case 100:
                    food.computeIfPresent("Pie", (k, v) -> v + 1);
                    liquidSteack.pop();
                    ingredientQueue.poll();
                    break;
                default:
                    liquidSteack.pop();
                    ingredientQueue.poll();
                    ingredientQueue.addFirst(ingredientToCook + 3);
            }
        }


        if (!food.containsValue(0)) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        if (liquidSteack.isEmpty()) {
            System.out.print("Liquids left: none");
        } else {
            System.out.printf("Liquids left: %n");
            while (!liquidSteack.isEmpty()){
                System.out.print(liquidSteack.poll());
                if (!liquidSteack.isEmpty()) {
                    System.out.print(", ");
                }
            }
        }

        if (ingredientQueue.isEmpty()) {
            System.out.println();
            System.out.print("Ingredients left: none");
        } else {
            System.out.printf("%nIngredients left: ");
            while (!ingredientQueue.isEmpty()) {
                System.out.print(ingredientQueue.poll());
                if (!ingredientQueue.isEmpty()){
                    System.out.print(", ");
                }
            }
        }

        if(ingredientQueue.isEmpty() && liquidSteack.isEmpty()) {
            System.out.println();
            food.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            });
        }

    }
}
