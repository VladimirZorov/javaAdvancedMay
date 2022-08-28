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

        int n = 50;
        while (n-- >0 ) {
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
            } else if (secondNumber == firstNumber) {
                firstPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }
            if (firstPlayerCards.isEmpty()
                    || secondPlayerCards.isEmpty()) {
                break;
            }
        }
            if (firstPlayerCards.size() ==  secondPlayerCards.size()) {
                System.out.println("Draw!");
            } else if (firstPlayerCards.size() < secondPlayerCards.size()) {
                System.out.println("Second player win!");
            } else if (secondPlayerCards.size() < firstPlayerCards.size()) {
                System.out.println("First player win!");
            }

    }
}
