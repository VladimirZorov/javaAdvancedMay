package JavaAdvancedExam25June2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milk = new ArrayDeque<>();
        ArrayDeque<Double> cacao = new ArrayDeque<>();

        double [] milkValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        double [] cacaoValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        for (Double milkV : milkValue) {
            milk.offer(milkV);
        }

        for (Double cacaoV : cacaoValue) {
            cacao.push(cacaoV);
        }

        System.out.println();
    }
}
