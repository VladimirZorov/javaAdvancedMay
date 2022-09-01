package JavaAdvancedExam25June2022;

import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        String[][] field = new String[fieldSize][fieldSize];


        int row = -1;
        int coll = -1;


        for (int i = 0; i < fieldSize; i++) {
            String[] fieldChars = scanner.nextLine().split(" ");
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = fieldChars[j];

                if (field.equals("D")) {
                    row = i;
                    coll = j;
                }
            }
        }

        int totalStolenMoney = 0;
        boolean caught = false;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    if (row - 1 >= 0) {
                        field[row][coll] = "+";
                        row--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    break;
                case "left":
                    break;
                case "right":
                    break;
            }

            if (field[row][coll].equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalStolenMoney);
                field[row][coll] = "#";
                caught = true;
                break;
            }
            if (field[row][coll].equals("$")) {
                System.out.printf("You successfully stole %d$.%n", row * coll);
                totalStolenMoney += row * coll;

            }
            field[row][coll] = "D";

        }

        if (!caught) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalStolenMoney);
        }

        for (int i = 0; i < fieldSize; i++) {
            System.out.println(String.join(" ", field[i]));
        }
    }
}
