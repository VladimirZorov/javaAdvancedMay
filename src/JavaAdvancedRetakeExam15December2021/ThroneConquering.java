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

        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case"up":
                    if (rowP - 1 >= 0) {
                        sparta[rowP][collP] = "-";
                        rowP--;
                        if (sparta[rowP][collP].equals("S"))
                        sparta[rowP][collP] = "P";
                        energy--;
                    }
                    break;
                case "down":

                    break;
                case "left":
                    break;
                case "right":
                    break;
            }

            input = scanner.nextLine();
        }


        System.out.println(sparta);
    }
}
