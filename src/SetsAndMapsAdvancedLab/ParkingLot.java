package SetsAndMapsAdvancedLab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String [] command = input.split(", ");
            if (command[0].equals("IN")) {
                parkingLot.add(command[1]);
            } else if (command[0].equals("OUT")) {
                parkingLot.remove(command[1]);
            }
            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }else {
            parkingLot.forEach(System.out::println);
        }
    }
}
