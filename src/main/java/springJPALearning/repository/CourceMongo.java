package springJPALearning.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springJPALearning.entities.CourseJPA;
import springJPALearning.entities.CourseMongo;
import springJPALearning.entities.Courses;

@Component
public class CourceMongo implements CourseRepository{
    @Autowired
    private CourceMongoRepo courceMongoRepo;
    @Override
    public void save(Object course) {
        CourseMongo courseMongo = (CourseMongo)course;
        this.courceMongoRepo.save(courseMongo);
    }
}
