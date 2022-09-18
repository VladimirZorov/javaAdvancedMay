package JavaAdvancedRetakeExam18August2021;

import java.util.ArrayDeque;
import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int countOfCommands = Integer.parseInt(scanner.nextLine());

        int row = -1;
        int coll = -1;

        String[][] field = new String[size][size];

        for (int i = 0; i < size; i++) {
            String[] inputField = scanner.nextLine().split("");
            for (int j = 0; j < size; j++) {
                field[i][j] = inputField[j];

                if (field[i][j].equals("P")) {
                    row = i;
                    coll = j;
                }
            }
        }

        for (int i = 0; i < countOfCommands; i++) {
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    if (row - 1 >= 0) {
                        row--;
                    }
                    break;
                case "down":
                    if (row+1 < size){
                        row++;
                    }
                    break;
                case "left":
                    if (coll-1 >=0){
                        coll--;
                    }
                    break;
                case "right":
                    if (coll+1 <size){
                        coll ++;
                    }
                    break;
            }
            if (field[row][coll].equals("F")){
                System.out.println("Well done, the player won first place!");
                printfield();
                break;
            } else if (field[row][coll].equals("T")) {

            } else if (field[row][coll].equals("B"))

        }
        System.out.println();
    }

    private static void printfield() {

    }

}
