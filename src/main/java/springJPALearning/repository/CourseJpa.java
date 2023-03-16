package springJPALearning.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import springJPALearning.entities.CourseJPA;
import springJPALearning.entities.Courses;

@Component
public class CourseJpa implements CourseRepository{
    @Autowired
    private CourseJpaRepo courseJpaRepo;
    @Override
    public void save(Object course) {
        CourseJPA courseJPA = (CourseJPA)course;
        this.courseJpaRepo.save(courseJPA);
    }
}
