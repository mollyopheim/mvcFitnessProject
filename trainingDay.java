package trainingDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mollyopheim
 * 
 * This class serves as the model
 *
 */

public class trainingDay {
	
	private static HashMap<String, String> exercises = new HashMap<String, String>();
	
	public void addExercise(String name, String num) {
		exercises.put(name, num);
	}
	
	
	public static HashMap<String, String> getExercises() {
		return exercises;
	}
	
}
