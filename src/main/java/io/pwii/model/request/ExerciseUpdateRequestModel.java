package io.pwii.model.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import io.pwii.entity.enums.WorkoutCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExerciseUpdateRequestModel {

  private String title;

  private String description;

  @Min(value = 1)
  @Max(value = 1000)
  private Integer reps;

  @Min(value = 1)
  @Max(value = 99)
  private Integer sets;

  private String time;

  @Max(value = 10000)
  private Double weight;

  private String equipment;

  private WorkoutCategory category;
  
}