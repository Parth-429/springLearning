package springElasticSearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.mongodb.core.mapping.DBRef;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    @Id
    private Long id;
    @Field
    private String name;
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Student> enrolledStudents;
    @Field(type = FieldType.Nested, includeInParent = true)
    private Professor professor;
}