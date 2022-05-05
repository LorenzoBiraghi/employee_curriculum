package it.vidiemme.employeecurriculum.repository;

import it.vidiemme.employeecurriculum.entity.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Long> {
}
