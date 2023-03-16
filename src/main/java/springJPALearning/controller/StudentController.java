package springJPALearning.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springJPALearning.entities.Student;
import springJPALearning.repository.StudentRepository;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Controller
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;
    public void saveStudent(Student student){
        this.studentRepository.save(student);
    }
}
