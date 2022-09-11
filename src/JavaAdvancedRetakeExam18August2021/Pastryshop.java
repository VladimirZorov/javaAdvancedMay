package JavaAdvancedRetakeExam18August2021;

import java.util.*;

public class Pastryshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] liquids = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int [] ingredients = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liquidSteack = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientQueue = new ArrayDeque<>();

        for (int liq : liquids) {
            liquidSteack.push(liq);
        }
        for (int ing : ingredients){
            ingredientQueue.offer(ing);
        }

        Map<String, Integer> food = new HashMap<>();

        food.put("Biscuit", 0);
        food.put("Cake", 0);
        food.put("Pastry", 0);
        food.put("Pie", 0);

        while (!liquidSteack.isEmpty() && !ingredientQueue.isEmpty()){
            int liquidToCook = liquidSteack.peek();
            int ingredientToCook = ingredientQueue.peek();

            switch ()
        }
    }
}
