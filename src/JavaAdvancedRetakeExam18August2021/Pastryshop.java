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
            liquidSteack.push(liq);
        }
        for (int ing : ingredients) {
            ingredientQueue.offer(ing);
        }

        Map<String, Integer> food = new HashMap<>();

        food.put("Biscuit", 0);
        food.put("Cake", 0);
        food.put("Pastry", 0);
        food.put("Pie", 0);

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
                    ingredientQueue.addFirst(ingredientToCook+3);
            }
        }


        food.forEach((s, integer) -> integer.compareTo(0));
        System.out.println("Great! You succeeded in cooking all the food!");
    }
}
