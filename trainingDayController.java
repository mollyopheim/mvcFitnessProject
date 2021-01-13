package trainingDay;

public class trainingDayController {
	
	private trainingDay model;
	private trainingDayView view;
	
	public trainingDayController(trainingDay model, trainingDayView view){
	      this.model = model;
	      this.view = view;
	}

	public void addToModel(String name, String num){
	      model.addExercise(name, num);		
	}
	
	

}
