package SetsAndMapsAdvancedLab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> students = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String [] studentGrade = scanner.nextLine().split(" ");

                students.putIfAbsent(studentGrade[0], new ArrayList<>());
                students.get(studentGrade[0]).add(Double.parseDouble(studentGrade[1]));

        }

        System.out.println();
    }
}
