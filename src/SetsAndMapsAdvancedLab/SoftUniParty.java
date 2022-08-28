package SetsAndMapsAdvancedLab;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> guests = new LinkedHashSet<>();
        LinkedHashSet<String> guestList = new LinkedHashSet<>();
        LinkedHashSet<String> dontComeGuest = new LinkedHashSet<>();
        LinkedHashSet<String> dontComeGuestVip = new LinkedHashSet<>();


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
                if ((guest.charAt(0) != 0)) {
                    dontComeGuest.add(guest);
                } else {
                    dontComeGuestVip.add(guest);
                }
            }
        }


        System.out.println(dontComeGuest.size());
        dontComeGuestVip.forEach(System.out::println);
        dontComeGuest.forEach(System.out::println);
    }
}
