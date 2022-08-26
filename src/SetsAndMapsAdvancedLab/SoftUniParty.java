package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> guests = new LinkedHashSet<>();
        LinkedHashSet<String> guestList = new LinkedHashSet<>();
        LinkedHashSet<String> dontComeGuest = new LinkedHashSet<>();


        while (!input.equals("PARTY")) {
            guests.add(input);
            input = scanner.nextLine();
        }
        while (!input.equals("END")) {
            guestList.add(input);
            input = scanner.nextLine();
        }

        for(String guest : guests){
            if (!guestList.contains(guest)) {
                dontComeGuest.add(guest);
            }
        }


        System.out.println(dontComeGuest.size());
        dontComeGuest.forEach(System.out::println);
    }
}
