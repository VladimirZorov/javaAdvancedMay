package JavaAdvancedRetakeExam15December2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] malesNums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int [] femalesNums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> males = new ArrayDeque<>();
        ArrayDeque<Integer> females = new ArrayDeque<>();

        int matches = 0;

        for (int male : malesNums) {
            if (male>0){
                males.push(male);
            }
        }
        for (int female : femalesNums) {
           if (female>0){
               females.offer(female);
           }
        }
        while (!males.isEmpty() && !females.isEmpty()){
            int workNumMales = males.peek();
            int workNumFemales = females.peek();

            if (workNumMales == workNumFemales) {
                males.pop();
                females.poll();
                matches++;
            } else {
                females.poll();
                males.getFirst();
            }
        }

        String malesLeft;
        String femalesLeft;
        if (males.size() >0) {
            malesLeft = String.valueOf(males.size());
        } else {
            malesLeft = "none";
        }

        if (females.size() >0) {
            femalesLeft = String.valueOf(females.size());
        } else {
            femalesLeft = "none";
        }

        System.out.println("Matches: " + matches);
        System.out.println("Males left: " + malesLeft);
        System.out.println("Females left: " + femalesLeft);
    }
}
