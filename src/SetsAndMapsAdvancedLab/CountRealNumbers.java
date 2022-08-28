package SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> valuesWithOccurrence = new LinkedHashMap<>();

        for (double value : values) {
            if (!valuesWithOccurrence.containsKey(value)) {
                valuesWithOccurrence.put(value, 1);
            } else {
                valuesWithOccurrence.put(value, valuesWithOccurrence.get(value) +1);
            }
        }
        for (Double key : valuesWithOccurrence.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, valuesWithOccurrence.get(key)));
        }
    }
}
