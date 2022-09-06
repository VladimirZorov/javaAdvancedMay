package FunctionalProgrammingLab;


import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();
        System.out.println(formatArray(numbers));
        Arrays.sort(numbers);
        System.out.println(formatArray(numbers));

    }
    static String formatArray(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }
}
