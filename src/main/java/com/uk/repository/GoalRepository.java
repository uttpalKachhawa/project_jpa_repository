/**
 * 
 */
package com.uk.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uk.model.Goal;
import com.uk.model.GoalReport;

/**
 * @author 212574988
 *
 */
@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long>{

	/*Goal save(Goal goal);
	
	List<Goal> loadAll();*/
	@Query("Select new com.uk.model.GoalReport(g.minutes,e.minutes,e.activity)" +
			"from Goal g, Exercise e where g.id= e.goal.id")
	List<GoalReport> findAllGoalReports();
}
