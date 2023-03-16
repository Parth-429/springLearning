package springElasticSearch.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import springElasticSearch.entity.Course;
import springElasticSearch.repository.CourseRepository;

@Data
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
}
