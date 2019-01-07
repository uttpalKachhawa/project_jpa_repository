/**
 * 
 */
package com.uk.model;

/**
 * @author 212574988
 *
 */
public class GoalReport {

	private int goalMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;
	
	public GoalReport(int goalMinutes,int exerciseMinutes,String exerciseActivity){
		
		this.goalMinutes=goalMinutes;
		this.exerciseMinutes=exerciseMinutes;
		this.exerciseActivity=exerciseActivity;
	}
	
	/**
	 * @return the goalMinutes
	 */
	public int getGoalMinutes() {
		return goalMinutes;
	}
	/**
	 * @param goalMinutes the goalMinutes to set
	 */
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	/**
	 * @return the exerciseMinutes
	 */
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	/**
	 * @param exerciseMinutes the exerciseMinutes to set
	 */
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	/**
	 * @return the exerciseActivity
	 */
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	/**
	 * @param exerciseActivity the exerciseActivity to set
	 */
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	
	
	
}
