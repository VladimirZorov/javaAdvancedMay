package FunctionalProgrammingLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        for (int inter: integers) {
            if (inter%2==0) {
                System.out.print(inter + ", ");
            }
        }

        System.out.println();
    }
}
