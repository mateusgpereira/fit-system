ALTER TABLE IF EXISTS gym_class_Athlete ADD CONSTRAINT UQ_gym_class_atlhete_gymclass UNIQUE (GymClass_id, athletes_id);