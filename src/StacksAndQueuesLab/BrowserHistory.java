package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> addres = new ArrayDeque<>();
        String current = "blank";
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!addres.isEmpty()) {
                    current= addres.pop();
                } else  {
                    current = "no previous URLs";
                }
            }else {
                if (!current.equals("blank")) {
                    addres.push(current);
                }
                current=input;
            }
            System.out.println(current);
            input = scanner.nextLine();
        }
    }
}