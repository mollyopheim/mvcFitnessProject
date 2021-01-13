package trainingDay;

import java.util.HashMap;

public class trainingDayView {

	
	public void printExercises() {
		HashMap<String, String> exercises = new HashMap<String, String>();
		exercises = trainingDay.getExercises();
		for (String s : exercises.keySet()) {
			System.out.println(s + ": " + exercises.get(s) + " reps");
		}
		
		
	}
}
