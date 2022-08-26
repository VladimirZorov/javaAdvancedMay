package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> guests = new LinkedHashSet<>();
        LinkedHashSet<String> guestList = new LinkedHashSet<>();

        while (!input.equals("END")) {
            while (!input.equals("PARTY")) {
                guests.add(input);
                input = scanner.nextLine();
            }
            guestList.add(input);
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
