/**
 * 
 */
package com.uk.service;

import java.util.List;

import com.uk.model.Goal;
import com.uk.model.GoalReport;

/**
 * @author 212574988
 *
 */
public interface GoalService {

	Goal saveGoal(Goal goal);
	List<Goal> findAllGoals();
	List<GoalReport> findAllGoalReports();
	
}
