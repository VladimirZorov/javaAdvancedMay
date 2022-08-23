package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split(" ");
        ArrayDeque<String> kidsNames = new ArrayDeque<>();

        for (String kid : kids) {
            kidsNames.add(kid);
        }

        int kidPosition = Integer.parseInt(scanner.nextLine());

        while (kidsNames.size() > 1) {
            for (int i = kidPosition-1; i < kidsNames.size(); i++) {
                System.out.println("Removed " + kidsNames.poll());
            }
        }
        System.out.println("Last is " + kidsNames.poll());
    }
}
