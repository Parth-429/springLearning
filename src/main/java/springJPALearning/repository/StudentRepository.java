package springJPALearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springJPALearning.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
