package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayerCards = new LinkedHashSet<>();
        String[] firsPlayer = scanner.nextLine().split(" ");
        String[] secondPlayer = scanner.nextLine().split(" ");

        for (int i = 0; i < firsPlayer.length; i++) {
            firstPlayerCards.add(Integer.parseInt(firsPlayer[i]));
            secondPlayerCards.add(Integer.parseInt(secondPlayer[i]));
        }

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);
            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }
        }

        if (firstPlayerCards.size() == 0 && secondPlayerCards.size() == 0) {
            System.out.println("Draw!");
        }else if (firstPlayerCards.size() == 0) {
            System.out.println("Second player win!");
        }else if (secondPlayerCards.size() == 0) {
            System.out.println("First player win!");
        }
    }
}
