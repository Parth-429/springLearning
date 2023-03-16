package springJPALearning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Target;
import java.util.List;

@Data
//@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student extends Person{
        private int rollNo;
        @OneToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
        @JoinColumn(name = "courses", referencedColumnName = "id")
        private List<Courses> courses;
}
