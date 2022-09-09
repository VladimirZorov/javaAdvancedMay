package JavaAdvancedRetakeExam15December2021;

import java.util.*;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] malesNums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] femalesNums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> males = new ArrayDeque<>();
        ArrayDeque<Integer> females = new ArrayDeque<>();

        int matches = 0;

        for (int male : malesNums) {
            if (male > 0) {
                males.push(male);
            }
        }
        for (int female : femalesNums) {
            if (female > 0) {
                females.offer(female);
            }
        }

        Iterator iterator = males.iterator();
        Iterator iterator1 = females.iterator();

        List<Integer> forRemoveMales = new ArrayList<>();

        while (iterator.hasNext()) {
            int num = (int) iterator.next();
            int countRedMal = 0;
            if (countRedMal > 0) {
                forRemoveMales.add(num);
                countRedMal = 0;
            }
            if (num % 25 == 0) {
                forRemoveMales.add(num);
                countRedMal++;
            }
        }
        for (int i = 0; i < forRemoveMales.size(); i++) {
            females.remove(forRemoveMales.get(i));
        }

        List<Integer> forRemoveFemales = new ArrayList<>();

        while (iterator1.hasNext()) {
            int num = (int) iterator1.next();
            int countRedFem = 0;
            if (countRedFem > 0) {
                forRemoveFemales.add(num);
                countRedFem = 0;
            }
            if (num % 25 == 0) {
                forRemoveFemales.add(num);
                countRedFem++;
            }
        }
        for (int i = 0; i < forRemoveFemales.size(); i++) {
            females.remove(forRemoveFemales.get(i));
        }

        while (!males.isEmpty() && !females.isEmpty()) {
            int workNumMales = males.peek();
            int workNumFemales = females.peek();

            if (workNumMales == workNumFemales) {
                males.pop();
                females.poll();
                matches++;
            } else {
                females.poll();
                int reducedMales = males.getFirst() - 2;
                males.pop();
                if (reducedMales > 0) {
                    males.addFirst(reducedMales);
                }
            }
        }


        System.out.println("Matches: " + matches);

        if (males.size() == 0) {
            System.out.print("Males left: none");
        } else {
            System.out.print("Males left: ");
            while (!males.isEmpty()) {
                System.out.print(males.pop());
                if (!males.isEmpty()) {
                    System.out.print(", ");

                }
            }
        }

        System.out.println();
        if (females.size() == 0) {
            System.out.print("Females left: none");
        } else {
            System.out.print("Females left: ");
            while (!females.isEmpty()) {
                System.out.print(females.poll());
                if (!females.isEmpty()) {
                    System.out.print(", ");
                }
            }
        }

    }
}
