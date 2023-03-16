package springElasticSearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springElasticSearch.entity.Student;
import springElasticSearch.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void saveStudent(Student student){
        this.studentRepository.save(student);
    }
}
