package trainingDay;

import java.util.Scanner;

public class MVC {

	public static void main(String[] args) {
		trainingDay model = new trainingDay();
		trainingDayView view = new trainingDayView();
		trainingDayController controller = new trainingDayController(model, view);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an exercise");
		String name = input.nextLine();
		System.out.println("Enter how many reps " + name + "should be completed for");
		String num = input.nextLine();

		controller.addToModel(name, num);
		
		view.printExercises();
		
	}

}
