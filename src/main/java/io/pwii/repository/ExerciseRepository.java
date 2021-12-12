package io.pwii.repository;

import java.util.Optional;
import javax.inject.Singleton;
import io.pwii.entity.Exercise;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@Singleton
public class ExerciseRepository implements PanacheRepository<Exercise> {

  public Optional<Exercise> findByIdAndWorkoutId(Long id, Long workoutId) {
    return find("id=?1 AND workout_id=?2", id, workoutId).firstResultOptional();
  }

  public Long deleteAllByWorkoutId(Long workoutId) {
    return delete("workout_id=?1", workoutId);
  }

}
