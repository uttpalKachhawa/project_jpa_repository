/**
 * 
 */
package com.uk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uk.model.Goal;
import com.uk.model.GoalReport;
import com.uk.repository.GoalRepository;

/**
 * @author 212574988
 *
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

	/* (non-Javadoc)
	 * @see com.pluralsight.service.GoalService#saveGoal(com.pluralsight.model.Goal)
	 */
	
	@Autowired
	private GoalRepository goalRepository;
	

	@Transactional
	public Goal saveGoal(Goal goal) {
		// TODO Auto-generated method stub
		return goalRepository.save(goal);
	}


	public List<Goal> findAllGoals() {
		// TODO Auto-generated method stub
		
		return goalRepository.findAll();
	}


	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		
		return goalRepository.findAllGoalReports();
	}

}
