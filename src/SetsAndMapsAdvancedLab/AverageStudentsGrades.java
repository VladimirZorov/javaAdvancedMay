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

        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double avg = 0;
            for (Double s : entry.getValue()) {
                System.out.printf("%.2f ", s);
                avg += s;
            }
//            double avg = entry.getValue().stream()
//                    .mapToDouble(Double::doubleValue)
//                    .average()
//                    .getAsDouble();
            System.out.printf("(avg: %.2f)%n", avg / entry.getValue().size());
        }
    }

}