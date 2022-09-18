package JavaAdvancedRetakeExam18August2021;

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
        boolean finish = false;

            for (int i = 0; i < countOfCommands; i++) {
                if (!finish) {
                String command = scanner.nextLine();
                switch (command) {
                    case "up":
                        field [row][coll] = ".";
                        if (row - 1 >= 0) {
                            row--;
                            field [row][coll] = ".";
                            if (field[row][coll].equals("B")) {
                                row--;
                            } else if (field[row][coll].equals("T")) {
                                row++;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        } else {
                            row = size - 1;
                            if (field[row][coll].equals("B")) {
                                row--;
                            } else if (field[row][coll].equals("T")) {
                                row++;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        }
                        break;
                    case "down":
                        field [row][coll] = ".";
                        if (row + 1 < size) {
                            row++;
                            if (field[row][coll].equals("B")) {
                                row++;
                            } else if (field[row][coll].equals("T")) {
                                row--;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        } else {
                            row = 0;
                            if (field[row][coll].equals("B")) {
                                row++;
                            } else if (field[row][coll].equals("T")) {
                                row--;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        }
                        break;
                    case "left":
                        field [row][coll] = ".";
                        if (coll - 1 >= 0) {
                            coll--;
                            if (field[row][coll].equals("B")) {
                                coll--;
                            } else if (field[row][coll].equals("T")) {
                                coll++;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        } else {
                            coll = size - 1;
                            if (field[row][coll].equals("B")) {
                                coll--;
                            } else if (field[row][coll].equals("T")) {
                                coll++;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        }
                        break;
                    case "right":
                        field [row][coll] = ".";
                        if (coll + 1 < size) {
                            coll++;
                            if (field[row][coll].equals("B")) {
                                coll++;
                            } else if (field[row][coll].equals("T")) {
                                coll--;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        } else {
                            coll = 0;
                            if (field[row][coll].equals("B")) {
                                coll++;
                            } else if (field[row][coll].equals("T")) {
                                coll--;
                            } else if (field[row][coll].equals("F")) {
                                finish = true;
                            }
                            field[row][coll] = "P";
                        }
                        break;
                }

        }else {
                    System.out.println("Well done, the player won first place!");
                    printField(size, field);
                }
            }
            if (finish) {
                System.out.println("Well done, the player won first place!");
                printField(size,field);
            } else {
                System.out.println("Oh no, the player got lost on the track!");
                printField(size, field);
            }

        }


    private static void printField(int size, String [][]field) {
        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                System.out.print(field[j][k]);
            }
            System.out.println();
        }
    }
}
