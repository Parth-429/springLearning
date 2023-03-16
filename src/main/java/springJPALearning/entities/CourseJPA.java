package springJPALearning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "Courses")
@NoArgsConstructor
public class CourseJPA extends Courses{

}
