package springJPALearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import springJPALearning.entities.CourseJPA;
import springJPALearning.entities.Courses;

@Repository
public interface CourseJpaRepo extends JpaRepository<CourseJPA,Long> {

}
