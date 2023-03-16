package springElasticSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import springElasticSearch.entity.Course;
import springElasticSearch.entity.Person;
import springElasticSearch.entity.Professor;
import springElasticSearch.entity.Student;
import springElasticSearch.services.CourseService;
import springElasticSearch.services.PersonService;
import springElasticSearch.services.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class LearnElasticAppl {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(LearnElasticAppl.class,args);
        PersonService personService = applicationContext.getBean(PersonService.class);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        personService.savePerson(new Person(1L,"Parth"));
        List<Course> courses = new ArrayList<>();
        Professor professor = new Professor(1L,"Parth");
        Course course =  new Course(1L, "JAVA", Collections.emptyList(), professor);
        courses.add(course);
        studentService.saveStudent(new Student(1L,"Parth","0-192019230912",courses));
    }
}
