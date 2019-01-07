package com.uk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="goals")
/*@NamedQueries({
	@NamedQuery(name=Goal.FIND_GOAL_REPORTS,query="Select new com.uk.model.GoalReport(g.minutes,e.minutes,e.activity)" +
		"from Goal g, Exercise e where g.id= e.goal.id"),
		@NamedQuery(name=Goal.FIND_ALL_GOALS,query="Select g from Goal g")
})*/
public class Goal {

	
	public static final String FIND_GOAL_REPORTS="findGoalReports";
	public static final String FIND_ALL_GOALS="findAllGoals";
	
	@OneToMany(mappedBy="goal", cascade=CascadeType.ALL , fetch=FetchType.EAGER)
	private List<Exercise> exercises = new ArrayList<Exercise>();

	@Id
	@GeneratedValue
	@Column(name="GOAL_ID")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="MINUTES")
	private int minutes;
	
	
	/**
	 * @return the exercises
	 */
	public List<Exercise> getExercises() {
		return exercises;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param exercises the exercises to set
	 */
	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	/**
	 * @param id
	 *            the id to set
	 */

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
