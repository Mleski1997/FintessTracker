package pl.FitnessTracker.FitnessTracker;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exerciseClass {

    private String exerciseName;
    private int caloriesBurned;
//    private String data;

    public exerciseClass(String exerciseName, int caloriesBurned) {
        this.exerciseName = exerciseName;
        this.caloriesBurned = caloriesBurned;
//        this.data = data;
    }

    public String returnName() {
        return exerciseName;
    }

    public int returnCalories() {
        return caloriesBurned;
    }

    public void saveExercise() throws FileNotFoundException {
        PrintWriter cardio = new PrintWriter("Cardio");
        cardio.println(returnName());
        cardio.close();
    }

    public void saveCalories() throws FileNotFoundException {
        PrintWriter cardio = new PrintWriter("Cardio");
        cardio.println(returnCalories());
        cardio.close();





        // TODO: Create another properties and methods

    }
}
