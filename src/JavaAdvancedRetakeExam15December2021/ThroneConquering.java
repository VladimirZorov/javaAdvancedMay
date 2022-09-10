package JavaAdvancedRetakeExam15December2021;

import java.util.Scanner;

public class ThroneConquering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int sizeSparta = Integer.parseInt(scanner.nextLine());

        String[][] sparta = new String[sizeSparta][sizeSparta];

        int rowP = -1;
        int collP = -1;

        for (int i = 0; i < sizeSparta; i++) {
            String[] elements = scanner.nextLine().split("");
            for (int j = 0; j < sizeSparta; j++) {
                sparta[i][j] = elements[j];

                if (sparta[i][j].equals("P")) {
                    rowP = i;
                    collP = j;
                }
            }
        }

        boolean reachHelan = false;
        boolean deadParis = false;

        String input = scanner.nextLine();
        while (!input.isEmpty() || !reachHelan || !deadParis) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "up":
                    if (rowP - 1 >= 0) {
                        sparta[rowP][collP] = "-";
                        rowP--;
                        energy--;
                        switch (sparta[rowP][collP]) {
                            case "H":
                                sparta[rowP][collP] = "-";
                                reachHelan = true;
                                break;
                            case"S":
                                tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                                break;
                            case"-":
                                sparta[rowP][collP] = "P";
                                break;
                        }
                    } else {
                        energy--;
                    }
                    if (sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])].equals("P")){
                        tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                    }
//                    sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = "S";

                    break;
                case "down":
                    if (rowP + 1 <sizeSparta) {
                        sparta[rowP][collP] = "-";
                        rowP++;
                        energy--;
                        switch (sparta[rowP][collP]) {
                            case "H":
                                sparta[rowP][collP] = "-";
                                reachHelan = true;
                                break;
                            case"S":
                                tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                                break;
                            case"-":
                                sparta[rowP][collP] = "P";
                                break;
                        }
                    } else {
                        energy--;
                    }
                    if (sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])].equals("P")){
                        tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                    }
//                    sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = "S";

                    break;
                case "left":
                    if (collP - 1 >=0) {
                        sparta[rowP][collP] = "-";
                        collP--;
                        energy--;
                        switch (sparta[rowP][collP]) {
                            case "H":
                                sparta[rowP][collP] = "-";
                                reachHelan = true;
                                break;
                            case"S":
                                tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                                break;
                            case"-":
                                sparta[rowP][collP] = "P";
                                break;
                        }
                    } else {
                        energy--;
                    }
                    if (sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])].equals("P")){
                        tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                    }
//                    sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = "S";

                    break;
                case "right":
                    if (collP + 1 <sizeSparta) {
                        sparta[rowP][collP] = "-";
                        collP++;
                        energy--;
                        switch (sparta[rowP][collP]) {
                            case "H":
                                sparta[rowP][collP] = "-";
                                reachHelan = true;
                                break;
                            case"S":
                                tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                                break;
                            case"-":
                                sparta[rowP][collP] = "P";
                                break;
                        }
                    } else {
                        energy--;
                    }
                    if (sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])].equals("P")){
                        tryToKillEnemy(sparta, energy, rowP, collP, deadParis);
                    }
//                    sparta[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = "S";

                    break;
            }

            input = scanner.nextLine();
        }


        if (!deadParis) {
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n",energy);
            for (int i = 0; i < sparta.length; i++) {
                System.out.println(String.join("", sparta[i]));
            }

        }
    }

    private static void tryToKillEnemy
            (String sparta[][], int energy, int rowP, int collP,  boolean deadParis) {
            energy -= 2;
            if (energy > 0) {
                sparta[rowP][collP] = "P";
            } else {
                sparta[rowP][collP] = "X";
                System.out.printf("Paris died at %d;%d.%n",rowP, collP);
                for (int i = 0; i < sparta.length; i++) {
                    System.out.println(String.join("", sparta[i]));
                }
                deadParis = true;
            }
        }


}
