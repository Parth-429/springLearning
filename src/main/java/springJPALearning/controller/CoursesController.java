package springJPALearning.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springJPALearning.entities.Courses;
import springJPALearning.repository.CourseRepository;
import springJPALearning.repository.Repository;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Controller
public class CoursesController {
    public CourseRepository courseRepository = Repository.getRepository("Mongo");
    public void saveCourse(Courses course){
         this.courseRepository.save(course);
    }
}
