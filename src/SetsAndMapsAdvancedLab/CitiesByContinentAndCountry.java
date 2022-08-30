package SetsAndMapsAdvancedLab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, String>> myData = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String [] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            myData.putIfAbsent(continent, new TreeMap<>());
            myData.get(continent).putIfAbsent(country, city);
        }

        System.out.println();
    }
}
