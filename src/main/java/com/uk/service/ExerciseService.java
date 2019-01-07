package com.uk.service;

import java.util.List;

import com.uk.model.Activity;
import com.uk.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}