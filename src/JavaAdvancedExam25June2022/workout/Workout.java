package JavaAdvancedExam25June2022.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
        private String type;
        private int exerciseCount;
        private List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }
    public void addExercise(Exercise exercise) {
        if (this.exercises.size()<this.exerciseCount) {
            exercises.add(exercise);
        }
    }
    public boolean removeExercise(String name, String muscle) {
       for (Exercise exercise:exercises) {
           if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
               this.exercises.remove(exercise);
               return true;
           }
       }
       return false;
    }
    public Exercise getExercise(String name, String muscle) {
        Exercise exercise = null;

        for (Exercise exer : this.exercises) {
            if (exer.getName().equals(name) && exer.getMuscle().equals(muscle)) {
                exercise = exer;
            }
        }
        return exercise;

    }
    public Exercise getMostBurnedCaloriesExercise() {
        Exercise exercise = null;
        int calories = 0;

        if (this.exercises.size() > 0) {
            for (Exercise ex : this.exercises) {
                if (ex.getBurnedCalories() > calories) {
                    calories = ex.getBurnedCalories();
                }
            }
            for (Exercise exer : this.exercises) {
                if (exer.getBurnedCalories() == calories) {
                    exercise = exer;
                    break;
                }
            }
        }
        return exercise;
    }

    public int getExerciseCount() {
        return this.exercises.size();
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Workout type: %s", this.type));
        builder.append(System.lineSeparator());

        for (Exercise exercise : this.exercises) {
            builder.append(exercise);
            builder.append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}

