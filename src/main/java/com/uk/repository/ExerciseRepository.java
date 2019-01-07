/**
 * 
 */
package com.uk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uk.model.Exercise;

/**
 * @author 212574988
 *
 */
@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

	@SuppressWarnings("unchecked")
	Exercise save(Exercise exercise);
}
