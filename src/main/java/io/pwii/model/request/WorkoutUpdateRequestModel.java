package io.pwii.model.request;

import java.util.List;
import io.pwii.entity.enums.WorkoutCategory;
import io.pwii.entity.enums.WorkoutCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkoutUpdateRequestModel {

  private WorkoutCode code;

  private WorkoutCategory category;

  private List<ExerciseUpdateRequestModel> exercises;
  
}
