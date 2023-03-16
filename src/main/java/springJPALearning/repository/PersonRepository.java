package springJPALearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springJPALearning.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
