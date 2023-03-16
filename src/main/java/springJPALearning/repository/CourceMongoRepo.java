package springJPALearning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springJPALearning.entities.CourseMongo;
import springJPALearning.entities.Courses;

@Repository
public interface CourceMongoRepo extends MongoRepository<CourseMongo, Long> {

}
